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

    // Patrones de validación
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^(?!.*[._]{2})[a-zA-Z0-9._]{3,15}(?<![._])$");
    private static final Pattern ISBN_PATTERN = Pattern.compile("^(97(8|9))?\\d{9}(\\d|X)$"); // ISBN-13

    // Mensajes de error
    private static final String EMAIL_ERROR_MESSAGE = "Ingrese una dirección de correo electrónico válida";
    private static final String USERNAME_ERROR_MESSAGE = "Ingrese un nombre de usuario válido";
    private static final String PASSWORDS_NOT_EQUAL_MESSAGE = "Ambas contraseñas deben ser idénticas";
    private static final String REQUIRED_FIELD_MESSAGE = "Este campo no puede estar vacío";
    private static final String INVALID_YEAR_MESSAGE = "El año debe estar entre %d y %d";
    private static final String INVALID_CATEGORY_MESSAGE = "Seleccione una categoría válida";
    private static final String INVALID_ISBN_MESSAGE = "Ingrese un ISBN válido";
    private static final String POSITIVE_NUMBER_MESSAGE = "El número debe ser mayor o igual a 0";
    private static final String LENGTH_EXCEEDED_MESSAGE = "La longitud máxima es de %d caracteres";

    // Validación de email
    public static boolean validateEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    // Validación de nombre de usuario
    public static boolean validateUsername(String username) {
        return USERNAME_PATTERN.matcher(username).matches();
    }

    // Validación de contraseñas iguales
    public static boolean validatePasswordsEqual(char[] password1, char[] password2) {
        return java.util.Arrays.equals(password1, password2);
    }

    // Validación de campo no vacío
    public static boolean validateNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    // Validación de longitud máxima
    public static boolean validateLength(String input, int maxLength) {
        return input != null && input.length() <= maxLength;
    }

    // Validación de año dentro de un rango
    public static boolean validateYear(int year, int minYear, int maxYear) {
        return year >= minYear && year <= maxYear;
    }

    // Validación de número positivo
    public static boolean validatePositiveNumber(int number) {
        return number >= 0;
    }

    // Validación de ISBN
    public static boolean validateISBN(String isbn) {
        return ISBN_PATTERN.matcher(isbn).matches();
    }

    // Validación de categoría
    public static boolean validateCategory(String category, String[] validCategories) {
        if (category == null || validCategories == null) return false;
        for (String validCategory : validCategories) {
            if (category.equalsIgnoreCase(validCategory)) {
                return true;
            }
        }
        return false;
    }

    public static String getValidationError(String fieldType, boolean isValid) {
        if (isValid) return "";

        return switch (fieldType.toLowerCase()) {
            case "email" -> EMAIL_ERROR_MESSAGE;
            case "username" -> USERNAME_ERROR_MESSAGE;
            case "password" -> PASSWORDS_NOT_EQUAL_MESSAGE;
            case "required" -> REQUIRED_FIELD_MESSAGE;
            case "isbn" -> INVALID_ISBN_MESSAGE;
            case "positive_number" -> POSITIVE_NUMBER_MESSAGE;
            case "length_exceeded" -> LENGTH_EXCEEDED_MESSAGE;
            case "category" -> INVALID_CATEGORY_MESSAGE;
            case "year" -> String.format(INVALID_YEAR_MESSAGE, 1500, 2024);
            default -> "Entrada inválida";
        };
    }
}
