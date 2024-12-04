package code.database.ormEuroza;

import code.database.Connectionval;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Schema {
    public static void create(String tableName, Consumer<Blueprint> funcion) throws SQLException {
        Blueprint blueprint = new Blueprint();
        funcion.accept(blueprint); 

        ArrayList<String> colls = blueprint.colls;
        if (colls.isEmpty()) {
            System.out.println("No se han definido columnas para la tabla.");
            return;
        }

        StringBuilder query = new StringBuilder("CREATE TABLE " + tableName + " (\n");

        for (int i = 0; i < colls.size(); i++) {
            query.append(colls.get(i));
            if (i < colls.size() - 1) {
                query.append(", \n");  
            }
        }
        query.append("\n);");

        Connectionval conn = new Connectionval();
        try (Connection myconn = conn.conectarMySQL(); Statement sentencia = myconn.createStatement()) {
            sentencia.executeUpdate(query.toString());
            System.out.println("Tabla " + tableName + " creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error al crear la tabla.");
        }
        blueprint.colls = null;
    }
}

