/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author User
 */
public class connection {
    String rootPath = Paths.get("").toAbsolutePath().toString();
    String envPath = rootPath + File.separator + ".env";
    Map<String, String> envVars = loadEnv(".env");
    
    public String driver = envVars.get("DB_DRIVER");
    public String driverUrl = envVars.get("DB_DRIVER_URL");
    public String database = envVars.get("DB_DATABASE");
    public String hostname = envVars.get("DB_HOSTNAME");
    public String port = envVars.get("DB_PORT");     
    public String url = driverUrl + hostname + ":" + port + "/" + database + "?useSSL=false";
    public String username = envVars.get("DB_USER");
    public String password = envVars.get("DB_PASSWORD");

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
    public static Map<String, String> loadEnv(String filePath) {
        Map<String, String> envVars = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
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
}
