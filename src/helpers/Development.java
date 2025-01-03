/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.helpers;

import java.lang.reflect.Field;

/**
 *
 * @author user
 */
public class Development {

    public static void varDump(Object obj) {
        if (obj == null) {
            System.out.println("null");
            return;
        }

        Class<?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();

        System.out.println("Class: " + objClass.getName());
        for (Field field : fields) {
            field.setAccessible(true); // Permite acceder a campos privados
            try {
                System.out.println(field.getName() + " = " + field.get(obj));
            } catch (IllegalAccessException e) {
                System.out.println(field.getName() + " = [inaccessible]");
            }
        }
    }

    public static void debugArray(String[] array) {
        if (array == null) {
            System.out.println("El arreglo es null.");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }

}
