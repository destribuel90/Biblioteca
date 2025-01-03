/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.helpers;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Sets {

    public static String[] resultSetToArray(ResultSet rs) throws SQLException {
        java.sql.ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] data = new String[columnCount];

        for (int i = 1; i <= columnCount; i++) {
            data[i - 1] = rs.getString(i); // Obtén los datos de cada columna
        }

        return data;
    }
}
