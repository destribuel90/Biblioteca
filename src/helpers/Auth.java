/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.helpers;

/**
 *
 * @author user
 */
public class Auth {

    public static boolean activeSession = false;
    public static String[] userData;
    public static final String IS_ADMIN = "admin";
    public static final String IS_USER = "user";

    public static void setActiveSession() {
        activeSession = true;
    }

    public static boolean isActiveSession() {
        return activeSession;
    }

    public static void setUserData(String[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("Datos de usuario inválidos");
        }
        userData = data;
    }

    public static boolean isAdmin() {
        return Auth.userData[4].equals(Auth.IS_ADMIN);
    }

    public static String[] getUserData() {
        return userData;
    }

    public static void destroySession() {
        activeSession = false;
        userData = null;
    }

}
