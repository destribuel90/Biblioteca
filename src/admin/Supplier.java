/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code.admin;

import code.database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form frmSupplier
     */
    public Supplier() {
        initComponents();
        initializeTable();
        loadSuppliers();
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
        tblSupplier = new javax.swing.JTable();
        btnSupplier = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Proveedores");

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Contacto", "Teléfono", "Correo", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSupplier);

        btnSupplier.setText("Nuevo proveedor");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

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
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSupplier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupplier)
                    .addComponent(btnBack))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        // TODO add your handling code here:
        dispose();
        new frmSupplier().setVisible(true);
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new code.view().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    private void loadSuppliers() {
        Database db = new Database();

        ResultSet rs = db.executeQuery("SELECT * FROM supplier", new String[0]);

        if (rs != null) {
            buildTable(rs); // Llama a buildTable directamente
        }
    }

    private void buildTable(ResultSet rs) {
        // Configurar el modelo de la tabla con las columnas necesarias
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nombre", "Contacto", "Teléfono", "Correo", "Dirección"}, 0);

        try {
            while (rs.next()) { // Aquí es donde el cursor avanza a la siguiente fila
                String id = rs.getString("id");
                String name = rs.getString("name");
                String contact = rs.getString("contact_name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                model.addRow(new Object[]{id, name, contact, phone, email, address});
            }
            tblSupplier.setModel(model); // Establece el modelo actualizado en la tabla
        } catch (SQLException ex) {
            Logger.getLogger(frmCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void handleRowDoubleClick(int row) {
        int selectedRow = tblSupplier.getSelectedRow();
        if (selectedRow != -1) {

            String[] options = {"Editar", "Eliminar", "Canclear"};

            String id = tblSupplier.getValueAt(selectedRow, 0).toString();
            String name = tblSupplier.getValueAt(selectedRow, 1).toString();
            String contactName = tblSupplier.getValueAt(selectedRow, 2).toString();
            String phone = tblSupplier.getValueAt(selectedRow, 3).toString();
            String email = tblSupplier.getValueAt(selectedRow, 4).toString();
            String address = tblSupplier.getValueAt(selectedRow, 5).toString();

            int choice = JOptionPane.showOptionDialog(
                    this,
                    "¿Qué acción deseas realizar?",
                    "Opciones de proveedor",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, //Icono 
                    options,
                    options[0]
            );

            Database db = new Database();

            switch (choice) {

                //Editar
                case 0 -> {
                    dispose();
                    new frmSupplier(id, name, contactName, phone, email, address).setVisible(true);
                }

                //Eliminar
                case 1 -> {

                    int opt = JOptionPane.showConfirmDialog(null, "¿Realmente deseas eliminar al proveedor \"" + name + "\"?", "Eliminar proveedor", JOptionPane.YES_NO_OPTION);

                    if (opt == JOptionPane.YES_OPTION) {
                        String[] params = {id};

                        int rowsAffected = db.update("DELETE FROM supplier WHERE id = ?", params);

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Proveedor eliminado con éxito");
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
        tblSupplier.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int row = tblSupplier.getSelectedRow();
                if (row != -1) {
                    handleRowDoubleClick(row);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JToggleButton btnSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSupplier;
    // End of variables declaration//GEN-END:variables
}