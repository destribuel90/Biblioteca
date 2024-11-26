/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.helpers;

import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class InputValidator {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^(?!.*[._]{2})[a-zA-Z0-9._]{3,15}(?<![._])$");

  
    private static final String EMAIL_ERROR_MESSAGE = "Ingrese una dirección de correo electrónico válida";
    private static final String USERNAME_ERROR_MESSAGE = "Ingrese un nombre de usuario válido";
    private static final String PASSWORDS_NOT_EQUAL_MESSAGE = "Ambas contraseñas deben ser idénticas";

   
    public static boolean validateEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    
    public static boolean validateUsername(String username) {
        return USERNAME_PATTERN.matcher(username).matches();
    }
    
    public static String getValidationError(String fieldType, boolean isValid) {
        if (isValid) return "";
        
        return switch (fieldType.toLowerCase()) {
            case "email" -> EMAIL_ERROR_MESSAGE;
            case "username" -> USERNAME_ERROR_MESSAGE;
            case "password" -> PASSWORDS_NOT_EQUAL_MESSAGE;
            default -> "Entrada inválida";
        };
    }
}
