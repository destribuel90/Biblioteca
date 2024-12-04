/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.database.ormEuroza;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Blueprint {
    public static ArrayList<String> colls = new ArrayList<>();
    public static void string(String name, Integer value) {
        if (value == null || value<0) {
            value = 45; 
        }
        String row = name + " varchar(" + value + ") not null";
        Blueprint.colls.add(row);
    }
    public static void integer(String name){
        String row = name + " int not null";
        Blueprint.colls.add(row);
    }
    public static void date(String name){
        String row = name + " date not null";
        Blueprint.colls.add(row);
    }
     public static void id(){
        String row ="id int auto_increment not null primary key";
        Blueprint.colls.add(row);
    }
}
