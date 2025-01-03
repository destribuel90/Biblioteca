/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code.admin;

import code.database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import code.helpers.Auth;
import code.database.Database;

/**
 *
 * @author user
 */
public class User extends javax.swing.JFrame {

    private boolean isDemote = false;

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        initializeTable();
        loadUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Administrar Usuarios");

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre de usuario", "E-mail", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);
        if (tblUser.getColumnModel().getColumnCount() > 0) {
            tblUser.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(btnBack)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new code.view().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    private void loadUsers() {
        Database db = new Database();

        ResultSet rs = db.executeQuery("SELECT * FROM libraryuser", new String[0]);

        if (rs != null) {
            buildTable(rs); // Llama a buildTable directamente
        }
    }

    private void buildTable(ResultSet rs) {
        // Configurar el modelo de la tabla con las columnas necesarias
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nombre", "E-mail", "Rol"}, 0);

        try {
            while (rs.next()) { // Aquí es donde el cursor avanza a la siguiente fila
                String id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String role = rs.getString("role");
                model.addRow(new Object[]{id, name, email, role});
            }
            tblUser.setModel(model); // Establece el modelo actualizado en la tabla
        } catch (SQLException ex) {
            Logger.getLogger(frmCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void handleRowDoubleClick(int row) {
        int selectedRow = tblUser.getSelectedRow();
        if (selectedRow != -1) {

            //String[] options = {"Eliminar", "Canclear"};
            List<String> options = new ArrayList<>();

            String id = tblUser.getValueAt(selectedRow, 0).toString();
            String name = tblUser.getValueAt(selectedRow, 1).toString();
            String email = tblUser.getValueAt(selectedRow, 2).toString();
            String role = tblUser.getValueAt(selectedRow, 3).toString();

            if (role.equals(Auth.IS_ADMIN)) {
                options.add("Degradar a usuario");
                isDemote = true;
            } else if (role.equals(Auth.IS_USER)) {
                options.add("Ascender a administrador");
            }

            options.add("Eliminar");
            options.add("Cancelar");

            int choice = JOptionPane.showOptionDialog(
                    this,
                    "¿Qué acción deseas realizar?",
                    "Opciones de usuario",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, //Icono 
                    options.toArray(),
                    options.get(0)
            );

            Database db = new Database();

            switch (choice) {

                //Degradar / Ascender
                case 0 -> {

                    int opt = JOptionPane.showConfirmDialog(
                            null,
                            String.format("¿Realmente quieres %s a %s a %s?", isDemote ? "degradar" : "ascender", isDemote ? "usuario" : "administrador", name),
                            isDemote ? "Degradar" : "Ascender" + " usuario",
                            JOptionPane.YES_NO_OPTION);

                    if (opt == JOptionPane.YES_OPTION) {

                        List<String> params = new ArrayList<>();

                        params.add(isDemote ? Auth.IS_USER : Auth.IS_ADMIN);
                        params.add(String.valueOf(id));

                        int rowsAffected = db.update("UPDATE libraryuser SET role = ? WHERE id = ?", params.toArray());

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    String.format("Usuario %s a %s con éxito",
                                            isDemote ? "degradado" : "ascendido",
                                            isDemote ? "usuario" : "administrador"
                                    )
                            );
                            
                            loadUsers();
                        }

                    }

                }

                //Eliminar
                case 1 -> {

                    int opt = JOptionPane.showConfirmDialog(null, "¿Realmente deseas eliminar al usuario \"" + name + "\"?", "Eliminar usuario", JOptionPane.YES_NO_OPTION);

                    if (opt == JOptionPane.YES_OPTION) {
                        String[] params = {id};

                        int rowsAffected = db.update("DELETE FROM libraryuser WHERE id = ?", params);

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito");
                            loadUsers();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Acción cancelada");
                    }

                }

                //Cancelar 
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Acción cancelada");
                }

            }

        }
    }

    private void initializeTable() {
        tblUser.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int row = tblUser.getSelectedRow();
                if (row != -1) {
                    handleRowDoubleClick(row);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
