package code.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    // Variables de configuración cargadas desde un archivo .env
    private String driver;
    private String driverUrl;
    private String hostname;
    private String port;
    private String database;
    private String username;
    private String password;
    private String connectionUrl;
    private String maxAllowedPacket;

    private Connection connection;

    public Database() {
        Map<String, String> envVars = loadEnv();
        this.driver = envVars.getOrDefault("DB_DRIVER", "com.mysql.cj.jdbc.Driver");
        this.driverUrl = envVars.getOrDefault("DB_DRIVER_URL", "jdbc:mysql://");
        this.hostname = envVars.getOrDefault("DB_HOSTNAME", "localhost");
        this.port = envVars.getOrDefault("DB_PORT", "3306");
        this.database = envVars.getOrDefault("DB_DATABASE", "library");
        this.username = envVars.getOrDefault("DB_USER", "root");
        this.password = envVars.getOrDefault("DB_PASSWORD", "");
        this.maxAllowedPacket = "?maxAllowedPacket=67108864";  // 64 MB

        this.connectionUrl = String.format("%s%s:%s/%s?useSSL=false&serverTimezone=UTC",
                driverUrl, hostname, port, database, maxAllowedPacket);
    }

    /**
     * Cargar las variables de entorno desde un archivo .env
     *
     * @return Map<String, String>
     */
    private Map<String, String> loadEnv() {
        Map<String, String> envVars = new HashMap<>();
        String envPath = Paths.get("").toAbsolutePath().toString() + File.separator + ".env";
        try (BufferedReader reader = new BufferedReader(new FileReader(envPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty() && !line.startsWith("#")) {
                    String[] parts = line.split("=", 2);
                    if (parts.length == 2) {
                        envVars.put(parts[0].trim(), parts[1].trim());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo .env: " + e.getMessage());
        }
        return envVars;
    }

    /**
     * Conectar a la base de datos
     */
    public void connect() {
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(connectionUrl, username, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "Error al conectar a la base de datos", e);
        }
    }

    /**
     * Desconectar de la base de datos
     */
    public void disconnect() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", e);
        }
    }

    /**
     * Ejecutar consultas de actualización (INSERT, UPDATE, DELETE)
     *
     * @param sql La consulta SQL
     * @param params Los parámetros para la consulta
     * @return Número de filas afectadas
     */
    public int update(String sql, Object[] params) {
        connect();
        int rowsAffected = 0;
        try (PreparedStatement pst = this.connection.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                if (params[i] instanceof String) {
                    pst.setString(i + 1, (String) params[i]);
                } else if (params[i] instanceof InputStream) {
                    pst.setBinaryStream(i + 1, (InputStream) params[i]);
                } else {
                    throw new IllegalArgumentException("Tipo de parámetro no soportado: " + params[i].getClass().getName());
                }
            }
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "Error en la consulta de actualización", e);
        } finally {
            disconnect();
        }
        return rowsAffected;
    }

    /**
     * Ejecutar consultas SELECT
     *
     * @param sql La consulta SQL
     * @param params Los parámetros para la consulta
     * @return ResultSet con los resultados
     */
    public ResultSet executeQuery(String sql, String[] params) {
        connect();
        ResultSet resultSet = null;
        try {
            PreparedStatement pst = this.connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pst.setString(i + 1, params[i]);
            }
            resultSet = pst.executeQuery();
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, "Error en la consulta SELECT", e);
        }
        return resultSet;
    }
}
