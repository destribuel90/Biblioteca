/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code;

import code.helpers.InputValidator;
import code.database.Database;
import code.helpers.ImageUpload;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author user
 */
public class frmBook extends javax.swing.JFrame {

    private String selectedImagePath; // Variable para almacenar la ruta del archivo seleccionado

    private String id;
    private String title;
    private String author;
    private String publisher;
    private String publicationYear;
    private String categoryId;
    private String isbn;
    private String copies;
    private String description;
    private String status;
    private String price;
    private String supplierId;
    private String image;

    private String formMode;

    public frmBook(String id, String title, String author, String publisher, String publicationYear, String categoryId, String isbn, String copies, String description, String status, String price, String supplierId, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.categoryId = categoryId;
        this.isbn = isbn;
        this.copies = copies;
        this.description = description;
        this.status = status;
        this.price = price;
        this.supplierId = supplierId;
        this.image = image;
        this.formMode = UPDATE_MODE;

        initComponents();
        loadCategories();
        loadSuppliers();

        lblTitle.setText("Editar libro");
        btnSaveEdit.setText("Guardar cambios");
        // Inicializar componentes con los valores existentes
        lblTitle.setText("Editar libro");
        btnSaveEdit.setText("Guardar cambios");
        txtTitle.setText(this.title);
        txtAuthor.setText(this.author);
        txtPublisher.setText(this.publisher);
        spnYear.setValue(Integer.valueOf(this.publicationYear));
        cboCategory.setSelectedItem(this.categoryId);
        txtIsbn.setText(this.isbn);
        spnCopies.setValue(Integer.valueOf(this.copies));
        txtaDesc.setText(this.description);
        txtPrice.setText(this.price);
        cboSupplier.setSelectedItem(this.supplierId);
        // Configurar la imagen si es necesario
        this.selectedImagePath = this.image;
    }

    private final String UPDATE_MODE = "update";
    private final String CREATE_MODE = "create";

    /**
     * Creates new form frmBook
     */
    public frmBook() {
        this.formMode = CREATE_MODE;
        initComponents();
        btnSaveEdit.setText("Registrar");
        lblTitle.setText("Registrar libro");
        loadCategories();
        loadSuppliers();
    }

    private void loadCategories() {
        try {
            Database db = new Database();
            ResultSet categories = db.executeQuery("SELECT name FROM category", new String[0]);

            // Limpia el JComboBox antes de agregar nuevos elementos (por si recargas las categorías)
            cboCategory.removeAllItems();

            // Verifica si el ResultSet tiene resultados y los añade al JComboBox
            while (categories != null && categories.next()) {
                String categoryName = categories.getString("name");
                cboCategory.addItem(categoryName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmBook.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al cargar las categorías: " + ex.getMessage());
        }

    }

    private void loadSuppliers() {
        try {
            Database db = new Database();
            ResultSet categories = db.executeQuery("SELECT name FROM supplier", new String[0]);

            // Limpia el JComboBox antes de agregar nuevos elementos (por si recargas las categorías)
            cboSupplier.removeAllItems();

            // Verifica si el ResultSet tiene resultados y los añade al JComboBox
            while (categories != null && categories.next()) {
                String categoryName = categories.getString("name");
                cboSupplier.addItem(categoryName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmBook.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al cargar los proveedores: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spnCopies = new javax.swing.JSpinner();
        cboSupplier = new javax.swing.JComboBox<>();
        spnYear = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnSaveEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblErrorCopy = new javax.swing.JLabel();
        lblErrorTitle = new javax.swing.JLabel();
        lblErrorAuthor = new javax.swing.JLabel();
        lblErrorYear = new javax.swing.JLabel();
        lblErrorCategory = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        lblErrorPublisher = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        lblErrorPrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDesc = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        lblErrorDesc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblErrorIsbn1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblErrorPrice1 = new javax.swing.JLabel();
        cboCategory = new javax.swing.JComboBox<>();
        btnImage = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 470));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Registrar / Editar Libro");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel2.setText("Título:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 130, 280, -1));

        jLabel3.setText("Año:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        getContentPane().add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 180, 280, -1));

        jLabel4.setText("Autor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(spnCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 316, 280, 30));

        getContentPane().add(cboSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 280, 30));
        getContentPane().add(spnYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 226, 280, 30));

        jLabel5.setText("Categoría:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 266, -1, -1));

        jLabel6.setText("Copias:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 316, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 386, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSaveEdit.setText("Registrar / Editar");
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnSaveEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveEdit)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 330, -1));

        lblErrorCopy.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 346, 280, 20));

        lblErrorTitle.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 150, 280, 20));

        lblErrorAuthor.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 200, 280, 20));

        lblErrorYear.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 476, 280, 20));

        lblErrorCategory.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 296, 280, 20));

        jLabel7.setText("Editorial:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 130, -1, -1));
        getContentPane().add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 130, 280, -1));

        lblErrorPublisher.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 150, 280, 20));

        jLabel8.setText("ISBN:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 180, -1, -1));
        getContentPane().add(txtIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 180, 280, -1));

        lblErrorPrice.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 280, 20));

        txtaDesc.setColumns(20);
        txtaDesc.setRows(5);
        jScrollPane1.setViewportView(txtaDesc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 270, 108));

        jLabel9.setText("Descripción:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        lblErrorDesc.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 346, 280, 20));

        jLabel10.setText("Precio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 280, -1));

        lblErrorIsbn1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorIsbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 200, 280, 20));

        jLabel11.setText("Proveedor:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        lblErrorPrice1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 280, 20));

        getContentPane().add(cboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 266, 280, 30));

        btnImage.setText("Subir imagen");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });
        getContentPane().add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditActionPerformed

        try {
            Database db = new Database();

            // Obtener valores directamente del formulario
            String title = txtTitle.getText();
            String author = txtAuthor.getText();
            String publisher = txtPublisher.getText();
            String publicationYear = spnYear.getValue().toString();
            String isbn = txtIsbn.getText();
            String copies = spnCopies.getValue().toString();
            String description = txtaDesc.getText();
            String price = txtPrice.getText();

            // Obtener IDs de categoría y proveedor
            String categoryId = null;
            String supplierId = null;
            String[] category = {(String) cboCategory.getSelectedItem()};
            String[] supplier = {(String) cboSupplier.getSelectedItem()};

            ResultSet rsCategory = db.executeQuery("SELECT id FROM category WHERE name = ?", category);
            ResultSet rsSupplier = db.executeQuery("SELECT id FROM supplier WHERE name = ?", supplier);

            if (rsCategory != null && rsCategory.next()) {
                categoryId = rsCategory.getString("id");
            }
            if (rsSupplier != null && rsSupplier.next()) {
                supplierId = rsSupplier.getString("id");
            }

            // Validar campos
            boolean isTitle = InputValidator.validateNotEmpty(title);
            boolean isAuthor = InputValidator.validateNotEmpty(author);
            boolean isPublisher = InputValidator.validateNotEmpty(publisher);
            boolean isIsbn = InputValidator.validateISBN(isbn);
            boolean isDesc = InputValidator.validateNotEmpty(description);
            boolean isYear = InputValidator.validateYear(Integer.parseInt(publicationYear), 1500, 2024);
            boolean isCopies = InputValidator.validatePositiveNumber(Integer.parseInt(copies));
            boolean isPrice = InputValidator.validatePositiveNumber((int) Double.parseDouble(price));

            // Actualización de etiquetas de error
            lblErrorTitle.setText(InputValidator.getValidationError("required", isTitle));
            lblErrorAuthor.setText(InputValidator.getValidationError("required", isAuthor));
            lblErrorPublisher.setText(InputValidator.getValidationError("required", isPublisher));
            lblErrorPrice.setText(InputValidator.getValidationError("isbn", isIsbn));
            lblErrorDesc.setText(InputValidator.getValidationError("required", isDesc));
            lblErrorYear.setText(InputValidator.getValidationError("year", isYear));
            lblErrorCopy.setText(InputValidator.getValidationError("positive_number", isCopies));
            lblErrorPrice.setText(InputValidator.getValidationError("positive_number", isPrice));

            if (isTitle && isAuthor && isYear && isCopies && isPublisher && isIsbn && isDesc && isPrice) {
                String imagePath = "";
                if (selectedImagePath != null && !selectedImagePath.isEmpty()) {
                    File imageFile = new File(selectedImagePath);
                    imagePath = ImageUpload.upload(imageFile);
                    if (imagePath != null) {
                        JOptionPane.showMessageDialog(this, "Imagen guardada correctamente.");
                    }
                }

                String[] params = {
                    title, author, publisher, publicationYear,
                    categoryId, supplierId, isbn, copies,
                    description, "available", price, imagePath
                };

                if (CREATE_MODE.equals(formMode)) {
                    // Insertar nuevo libro
                    int rowsAffected = db.update(
                            "INSERT INTO book (title, author, publisher, publication_year, category_id, supplier_id, isbn, copies, description, status, price, image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                            params
                    );
                    JOptionPane.showMessageDialog(this, rowsAffected > 0 ? "Libro registrado correctamente" : "Error al registrar el libro");
                } else if (UPDATE_MODE.equals(formMode)) {
                    // Actualizar libro existente
                    String[] updateParams = Arrays.copyOf(params, params.length + 1);
                    updateParams[updateParams.length - 1] = id; // Añadir el ID del libro
                    int rowsAffected = db.update(
                            "UPDATE book SET title = ?, author = ?, publisher = ?, publication_year = ?, category_id = ?, supplier_id = ?, isbn = ?, copies = ?, description = ?, status = ?, price = ?, image = ? WHERE id = ?",
                            updateParams
                    );
                    JOptionPane.showMessageDialog(this, rowsAffected > 0 ? "Cambios guardados correctamente" : "Error al guardar cambios");
                    dispose();
                    new view().setVisible(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "jpeg", "gif"));

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
            if (selectedFile.exists()) {
                selectedImagePath = selectedFile.getAbsolutePath(); // Guardar la ruta absoluta
                JOptionPane.showMessageDialog(this, "Archivo seleccionado: " + selectedImagePath);

                try {
                    ImageUpload.upload(selectedFile);
                    System.out.println("Imagen subida, ruta retornada: " + this.selectedImagePath);
                    JOptionPane.showMessageDialog(this, "Imagen subida exitosamente a: " + this.selectedImagePath);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al subir la imagen: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo seleccionado no existe.");
                System.out.println("El archivo no existe.");
            }
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Selección cancelada.");
            System.out.println("Selección cancelada por el usuario.");
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new view().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frmBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JComboBox<String> cboCategory;
    private javax.swing.JComboBox<String> cboSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblErrorAuthor;
    private javax.swing.JLabel lblErrorCategory;
    private javax.swing.JLabel lblErrorCopy;
    private javax.swing.JLabel lblErrorDesc;
    private javax.swing.JLabel lblErrorIsbn1;
    private javax.swing.JLabel lblErrorPrice;
    private javax.swing.JLabel lblErrorPrice1;
    private javax.swing.JLabel lblErrorPublisher;
    private javax.swing.JLabel lblErrorTitle;
    private javax.swing.JLabel lblErrorYear;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spnCopies;
    private javax.swing.JSpinner spnYear;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextArea txtaDesc;
    // End of variables declaration//GEN-END:variables
}
