/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code;

//import at.favre.lib.crypto.bcrypt.BCrypt;
import code.helpers.InputValidator;
import code.helpers.Auth;
import java.util.Arrays;
import javax.swing.JOptionPane;
import code.database.Database;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class frmRegister extends javax.swing.JFrame {

    /**
     * Creates new form frmRegister
     */
    public frmRegister() {
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

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtpPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        txtpPasswordConfirm = new javax.swing.JPasswordField();
        lblEmailError = new javax.swing.JLabel();
        lblUsernameError = new javax.swing.JLabel();
        lblPasswordConfirmError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(520, 570));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registrarse");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 470));

        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre de usuario"));

        txtpPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo electrónico"));

        txtpPasswordConfirm.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirmar contraseña"));

        lblEmailError.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEmailError.setForeground(new java.awt.Color(255, 0, 0));

        lblUsernameError.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));

        lblPasswordConfirmError.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPasswordConfirmError.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setText("¿Ya tienes una cuenta?");

        lblLogin.setForeground(new java.awt.Color(0, 102, 255));
        lblLogin.setText("Iniciar Sesión");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblLogin))
                .addGap(0, 0, 0))
        );

        btnRegister.setText("Ok");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblPasswordConfirmError, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(txtpPasswordConfirm)
                            .addComponent(txtpPassword)
                            .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(lblEmailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(txtpPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswordConfirmError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // Obtener los valores de los campos
        String email = txtEmail.getText();
        String username = txtUsername.getText();
        char[] password = txtpPassword.getPassword();

        // Validar entradas
        boolean isEmail = InputValidator.validateEmail(email);
        boolean isUsername = InputValidator.validateUsername(username);
        boolean passwordEquals = Arrays.equals(password, txtpPasswordConfirm.getPassword());

        lblEmailError.setText(InputValidator.getValidationError("email", isEmail));
        lblUsernameError.setText(InputValidator.getValidationError("username", isUsername));
        lblPasswordConfirmError.setText(InputValidator.getValidationError("password", passwordEquals));

        // Solo proceder si las validaciones son correctas
        if (isEmail && isUsername && passwordEquals) {
            // Registrar y logear al usuario
            Database db = new Database();

            String passwordString = new String(password);
            // Encriptar la contraseña utilizando BCrypt
            //String hashedPassword = BCrypt.withDefaults().hashToString(12, password);

            // Parámetros para la consulta con la contraseña encriptada
            List<String> params = new ArrayList<>();
            params.add(username);
            params.add(email);
            params.add(passwordString);
            params.add("user");

            // Ejecutar la consulta para registrar al usuario
            int rowsAffected = db.update("INSERT INTO libraryuser (name, email, password, role) VALUES (?, ?, ?, ?)", params.toArray());

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Te has registrado exitosamente.");
                new frmLogin().login(email, passwordString);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al registrarte.");
            }

            // Mostrar mensaje y cambiar de vista
            dispose();
            try {
                new view().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(frmRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

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
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPasswordConfirmError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtpPassword;
    private javax.swing.JPasswordField txtpPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
