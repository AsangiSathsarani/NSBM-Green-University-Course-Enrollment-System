/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmuniversity;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asangi
 */
public class RegisterPart2 extends javax.swing.JFrame {
    DBOperation dbops = new DBOperation();
    /**
     * Creates new form RegisterPart2
     */
    public RegisterPart2() {
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

        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtAllIndexNo = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtSchool = new javax.swing.JTextField();
        txtDisrict = new javax.swing.JTextField();
        txtIRank = new javax.swing.JTextField();
        ddSub1 = new javax.swing.JComboBox<>();
        ddSub2 = new javax.swing.JComboBox<>();
        ddSub3 = new javax.swing.JComboBox<>();
        txtZscore = new javax.swing.JTextField();
        txtMedium = new javax.swing.JTextField();
        txtAttempt = new javax.swing.JTextField();
        txtDRank = new javax.swing.JTextField();
        ddGrade3 = new javax.swing.JComboBox<>();
        ddGrade1 = new javax.swing.JComboBox<>();
        ddGrade2 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnYes = new javax.swing.JRadioButton();
        btnNo = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRegId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register AL Result details");
        getContentPane().setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("A/L Index No");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 42, 134, 27);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Year");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 75, 134, 24);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("School");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(24, 110, 120, 26);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("District");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(10, 147, 134, 24);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Island Rank");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 182, 134, 25);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Subject I");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(10, 242, 134, 24);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Subject II");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(10, 277, 134, 24);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Subject III");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(10, 312, 134, 24);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Z-Score");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 377, 134, 27);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Medium");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 342, 134, 24);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Attempt");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 410, 134, 25);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("District Rank");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 213, 134, 22);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Grade");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(375, 277, 172, 24);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Grade");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(375, 312, 172, 24);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Grade");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(375, 242, 172, 24);
        getContentPane().add(txtAllIndexNo);
        txtAllIndexNo.setBounds(162, 47, 110, 20);
        getContentPane().add(txtYear);
        txtYear.setBounds(162, 79, 110, 20);
        getContentPane().add(txtSchool);
        txtSchool.setBounds(162, 115, 197, 20);
        getContentPane().add(txtDisrict);
        txtDisrict.setBounds(162, 151, 126, 20);
        getContentPane().add(txtIRank);
        txtIRank.setBounds(162, 186, 79, 20);

        ddSub1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eccon", "Mathematics" }));
        getContentPane().add(ddSub1);
        ddSub1.setBounds(162, 246, 209, 20);

        ddSub2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bisiness", "Physics" }));
        getContentPane().add(ddSub2);
        ddSub2.setBounds(162, 281, 209, 20);

        ddSub3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Management", "Chemistry", "IT" }));
        getContentPane().add(ddSub3);
        ddSub3.setBounds(162, 316, 209, 20);
        getContentPane().add(txtZscore);
        txtZscore.setBounds(162, 382, 94, 20);
        getContentPane().add(txtMedium);
        txtMedium.setBounds(162, 346, 112, 20);
        getContentPane().add(txtAttempt);
        txtAttempt.setBounds(162, 414, 61, 20);
        getContentPane().add(txtDRank);
        txtDRank.setBounds(162, 216, 69, 20);

        ddGrade3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F" }));
        getContentPane().add(ddGrade3);
        ddGrade3.setBounds(565, 316, 50, 20);

        ddGrade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F" }));
        getContentPane().add(ddGrade1);
        ddGrade1.setBounds(565, 246, 50, 20);

        ddGrade2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F" }));
        getContentPane().add(ddGrade2);
        ddGrade2.setBounds(565, 281, 50, 20);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(162, 491, 112, 41);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Are you Register February ?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(278, 501, 327, 17);

        btnYes.setText("Yes");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });
        getContentPane().add(btnYes);
        btnYes.setBounds(623, 500, 65, 23);

        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNo);
        btnNo.setBounds(720, 500, 61, 23);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 491, 123, 41);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Reg Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 11, 134, 25);

        txtRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegId);
        txtRegId.setBounds(162, 15, 110, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        RegisterDetailsPart2 rd2 = new RegisterDetailsPart2();
        rd2.setRegId(Integer.parseInt(txtRegId.getText()));
        rd2.setAlIndexNo(Integer.parseInt(txtAllIndexNo.getText()));
        rd2.setYear(Integer.parseInt(txtYear.getText()));
        rd2.setSchool(txtSchool.getText());
        rd2.setDistrict(txtDisrict.getText());
        rd2.setiRank(Integer.parseInt(txtIRank.getText()));
        rd2.setdRank(Integer.parseInt(txtDRank.getText()));
        rd2.setSub1(ddSub1.getSelectedItem().toString());
        rd2.setGrade1(ddGrade1.getSelectedItem().toString());
        rd2.setSub2(ddSub2.getSelectedItem().toString());
        rd2.setGrade2(ddGrade2.getSelectedItem().toString());
        rd2.setSub3(ddSub3.getSelectedItem().toString());
        rd2.setGrade3(ddGrade3.getSelectedItem().toString());
        rd2.setMedium(txtMedium.getText());
        rd2.setZcore(txtZscore.getText());
        rd2.setAttempt(Integer.parseInt(txtAttempt.getText()));
        if(dbops.RegStudentpart2(rd2)){
            JOptionPane.showMessageDialog(this, "Succsesfully!!");
            clearFieald();
        }
        else{
            JOptionPane.showMessageDialog(this, "UnSuccsesfully!!");
            clearFieald();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
       this.dispose();
       UndergraduateEnrolledCourse uec = new UndergraduateEnrolledCourse();
       uec.setVisible(true);
       uec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        this.dispose();
        UndergraduateEnrolledCourse1 uec1 = new UndergraduateEnrolledCourse1();
        uec1.setVisible(true);
        uec1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
        RegisterStudent rs = new RegisterStudent();
        rs.setVisible(true);
        rs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegIdActionPerformed
    void clearFieald(){
        txtAllIndexNo.setText("");
        txtYear.setText("");
        txtSchool.setText("");
        txtDisrict.setText("");
        txtIRank.setText("");
        txtDRank.setText("");
        txtMedium.setText("");
        txtZscore.setText("");
        txtAttempt.setText("");
        
    
    }
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
            java.util.logging.Logger.getLogger(RegisterPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPart2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnNo;
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton btnYes;
    private javax.swing.JComboBox<String> ddGrade1;
    private javax.swing.JComboBox<String> ddGrade2;
    private javax.swing.JComboBox<String> ddGrade3;
    private javax.swing.JComboBox<String> ddSub1;
    private javax.swing.JComboBox<String> ddSub2;
    private javax.swing.JComboBox<String> ddSub3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAllIndexNo;
    private javax.swing.JTextField txtAttempt;
    private javax.swing.JTextField txtDRank;
    private javax.swing.JTextField txtDisrict;
    private javax.swing.JTextField txtIRank;
    private javax.swing.JTextField txtMedium;
    private javax.swing.JTextField txtRegId;
    private javax.swing.JTextField txtSchool;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtZscore;
    // End of variables declaration//GEN-END:variables
}
