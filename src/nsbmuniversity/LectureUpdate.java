/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmuniversity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Asangi
 */
public class LectureUpdate extends javax.swing.JFrame {
    DBOperation dbops = new DBOperation();
    String url = "jdbc:mysql://localhost:3306/nsbmuniversity";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    /**
     * Creates new form LectureUpdate
     */
    public LectureUpdate() {
        initComponents();
    }
    void setFields(SaveLectureDetails sld){
        txtLecId.setText(new Integer(sld.getLecId()).toString());
        txtName.setText(sld.getLecName());
        
        txtEmail.setText(sld.getEmail());
        txtTelNo.setText(sld.getTelNo());
        
        ddDepartment.setSelectedItem(sld.getDepName());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        ddDepartment = new javax.swing.JComboBox<>();
        btnSaveChange = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtLecId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lecture Update");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 75, 91, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 125, 111, 24);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Contact No");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(19, 167, 102, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Department");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 210, 111, 25);
        getContentPane().add(txtName);
        txtName.setBounds(131, 78, 226, 20);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(131, 129, 226, 20);
        getContentPane().add(txtTelNo);
        txtTelNo.setBounds(131, 171, 167, 20);

        ddDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering" }));
        getContentPane().add(ddDepartment);
        ddDepartment.setBounds(131, 214, 226, 20);

        btnSaveChange.setText("Save Change");
        btnSaveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaveChange);
        btnSaveChange.setBounds(131, 287, 121, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Lec Id");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 34, 91, 22);

        txtLecId.setEditable(false);
        getContentPane().add(txtLecId);
        txtLecId.setBounds(131, 37, 91, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSaveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangeActionPerformed
  
       try{
        con = (Connection) DriverManager.getConnection(url, username, password);
        String query = "UPDATE lecturedetails SET lecName = '"+txtName.getText()+"',email = '"+txtEmail.getText() +"',telNo = '"+txtTelNo.getText()+"',depName = '"+ddDepartment.getSelectedItem() +"' WHERE lecId ="+txtLecId.getText();
        pst = (PreparedStatement) con.prepareStatement(query);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Update Succesefully!!");
        
        }catch(Exception e){
            System.out.println(e);
           
        }
    }//GEN-LAST:event_btnSaveChangeActionPerformed

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
            java.util.logging.Logger.getLogger(LectureUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LectureUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LectureUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LectureUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LectureUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChange;
    private javax.swing.JComboBox<String> ddDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLecId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTelNo;
    // End of variables declaration//GEN-END:variables
}
