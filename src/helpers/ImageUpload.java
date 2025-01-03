/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.helpers;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class ImageUpload {

    private static final String IMAGE_DIRECTORY = "Images"; // Carpeta en el proyecto

    private static String imageName;

    static {
        // Crear el directorio si no existe
        File directory = new File(IMAGE_DIRECTORY);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    /**
     * Sube una imagen al directorio predeterminado y devuelve la ruta relativa.
     *
     * @param imageFile Archivo de imagen a subir.
     * @return Ruta relativa de la imagen guardada.
     */
    public static String upload(File imageFile) {
        // Verificar que el archivo de origen existe
        if (imageFile == null || !imageFile.exists()) {
            throw new IllegalArgumentException("El archivo proporcionado no existe o es nulo: " + (imageFile != null ? imageFile.getAbsolutePath() : "null"));
        }

        // Obtener la ruta relativa de la carpeta de imágenes en el proyecto
        File directory = new File(IMAGE_DIRECTORY); // Ruta relativa dentro del proyecto

        if (!directory.exists()) {
            boolean created = directory.mkdirs();
            if (!created) {
                throw new RuntimeException("No se pudo crear el directorio de destino: " + directory.getAbsolutePath());
            }
        }

        // Generar un nombre único para la imagen
        imageName = UUID.randomUUID().toString() + ".jpg";
        File destinationFile = new File(directory, imageName);

        // Copiar la imagen al directorio de destino
        try (FileInputStream inputStream = new FileInputStream(imageFile); FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al copiar la imagen: " + e.getMessage(), e);
        }

        // Devolver la ruta relativa para su uso posterior
        return destinationFile.getAbsolutePath();
    }

    /**
     * Elimina una imagen existente del directorio.
     *
     * @param relativeImagePath Ruta relativa de la imagen a eliminar.
     */
    public static void delete(String relativeImagePath) {
        if (relativeImagePath != null) {
            File fileToDelete = new File(IMAGE_DIRECTORY, new File(relativeImagePath).getName());
            if (fileToDelete.exists()) {
                fileToDelete.delete();
            }
        }
    }

    /**
     * Obtiene la extensión de un archivo.
     *
     * @param fileName Nombre del archivo.
     * @return Extensión del archivo (incluye el punto, por ejemplo, ".jpg").
     */
    public static String getFileExtension(String fileName) {
        int lastIndexOfDot = fileName.lastIndexOf(".");
        return (lastIndexOfDot == -1) ? "" : fileName.substring(lastIndexOfDot);
    }

    public void adjustImageToLabel(String filename, JLabel label) {
        ImageIcon cromo = new ImageIcon(getClass().getResource("/Images/" + filename));
        ImageIcon escala = new ImageIcon(cromo.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(escala);
    }
}
