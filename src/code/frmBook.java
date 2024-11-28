/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code;

import code.helpers.InputValidator;

/**
 *
 * @author user
 */
public class frmBook extends javax.swing.JFrame {

    /**
     * Creates new form frmBook
     */
    public frmBook() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spnCopies = new javax.swing.JSpinner();
        cboCategory = new javax.swing.JComboBox<>();
        spnYear = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblErrorCopy = new javax.swing.JLabel();
        lblErrorTitle = new javax.swing.JLabel();
        lblErrorAuthor = new javax.swing.JLabel();
        lblErrorYear = new javax.swing.JLabel();
        lblErrorCategory = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 470));
        setPreferredSize(new java.awt.Dimension(540, 466));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Libro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel2.setText("Título:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 280, -1));

        jLabel3.setText("Año:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        getContentPane().add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 280, -1));

        jLabel4.setText("Autor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(spnCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 280, 30));

        cboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 280, 30));
        getContentPane().add(spnYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 226, 280, 30));

        jLabel5.setText("Categoría:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setText("Copias:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");

        btnCancel.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(40, 40, 40)
                .addComponent(btnEdit)
                .addGap(38, 38, 38)
                .addComponent(btnCancel)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 330, 70));

        lblErrorCopy.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 280, 20));

        lblErrorTitle.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 280, 20));

        lblErrorAuthor.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 280, 20));

        lblErrorYear.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 280, 20));

        lblErrorCategory.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErrorCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 280, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String validCategories[] = {"Ciencia", "Historia", "Ficción", "Educativo"};
        
        boolean isTitle = InputValidator.validateNotEmpty(txtTitle.getText());
        boolean isAuthor = InputValidator.validateNotEmpty(txtAuthor.getText());
        boolean isYear = InputValidator.validateYear((int) spnYear.getValue(), 1500, 2024);
        boolean isCategory = InputValidator.validateCategory((String) cboCategory.getSelectedItem(), validCategories);
        boolean isCopies = InputValidator.validatePositiveNumber((int) spnCopies.getValue());
        
        lblErrorTitle.setText(InputValidator.getValidationError("required", isTitle));
        lblErrorAuthor.setText(InputValidator.getValidationError("required", isAuthor));
        lblErrorYear.setText(InputValidator.getValidationError("year", isYear));
        lblErrorCategory.setText(InputValidator.getValidationError("category", isCategory));
        lblErrorCopy.setText(InputValidator.getValidationError("positive_number", isCopies));
        
        
        if (isTitle && isAuthor && isYear && isCategory && isCopies) {
            //Registrar Libro
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed


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
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblErrorAuthor;
    private javax.swing.JLabel lblErrorCategory;
    private javax.swing.JLabel lblErrorCopy;
    private javax.swing.JLabel lblErrorTitle;
    private javax.swing.JLabel lblErrorYear;
    private javax.swing.JSpinner spnCopies;
    private javax.swing.JSpinner spnYear;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
