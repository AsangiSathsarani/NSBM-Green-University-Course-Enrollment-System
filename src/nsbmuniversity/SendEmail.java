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
import java.sql.SQLException;
import java.util.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Asangi
 */
public class SendEmail extends javax.swing.JFrame {
    String url = "jdbc:mysql://localhost:3306/nsbmuniversity";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    PreparedStatement pst1 = null;
    ResultSet res1 = null;
    /**
     * Creates new form SendEmail
     */
    public SendEmail() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRegId = new javax.swing.JTextField();
        txtNameIni = new javax.swing.JTextField();
        txtCourseId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnEnter = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtLecAssGrade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRpoGrade = new javax.swing.JTextField();
        txtExamGrade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPracAssGrade = new javax.swing.JTextField();
        txtPracProjectGrade = new javax.swing.JTextField();
        txtPracExamGrade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtToGmail = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtGpa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Result Send to Student");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Student Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Student Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Course Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Message");

        txtRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegIdActionPerformed(evt);
            }
        });

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        jScrollPane1.setViewportView(txtMessage);

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Lec Assaigment Marks");

        txtLecAssGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLecAssGradeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Lec Report Marks");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Lec Exam Marks");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Practicale Assigment Marks");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Practical Project Marks");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Practical Exam Marks");

        txtPracProjectGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPracProjectGradeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("To Gmail Account");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("GPA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameIni, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLecAssGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExamGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtRegId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtToGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtGpa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPracExamGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addComponent(txtPracProjectGrade, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPracAssGrade, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameIni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLecAssGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExamGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPracAssGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPracProjectGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPracExamGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGpa, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSend)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
            pst = con.prepareStatement("SELECT examresult.stuName ,examresult.cozId ,examresult.gradeofLec , examresult.gradeofReport ,examresult.gradeofExam ,examresult.grafeofPracticalAss , examresult.gradeofProject , examresult.gradeofPracticalExam    FROM examresult WHERE examresult.regId = '"+txtRegId.getText()+"' ");
            
            res = pst.executeQuery();
            while(res.next()){
                String name = res.getString(1);
                String courseId = res.getString(2);
                String lectureAssGrade = res.getString(3);
                String lectureRportGrade = res.getString(4);
                String exameGrade = res.getString(5);
                String practicalAssGrade = res.getString(6);
                String projectGrade = res.getString(7);
                String practicalExamGrade = res.getString(8);
                txtNameIni.setText(name);
                txtCourseId.setText(courseId);
                txtLecAssGrade.setText(lectureAssGrade);
                txtRpoGrade.setText(lectureRportGrade);
                txtExamGrade.setText(exameGrade);
                txtPracAssGrade.setText(practicalAssGrade);
                txtPracProjectGrade.setText(projectGrade);
                txtPracExamGrade.setText(practicalExamGrade);
                txtMessage.setText("Hello Student This is your Marks for the "+courseId+ "\nSubject Grade Last Written Exam\n\n"+"Lecture Assigment Grade   "+lectureAssGrade+"\nLecture Report Grade     "+lectureRportGrade+"\nExame Grade     "+exameGrade+"\nPractical Assigment Grade    "+practicalAssGrade+"\nProject Grade    "+projectGrade+"\nPractical Exam Grade     "+practicalExamGrade+"\n\n\nThank you\nNSBM University");
                
                
                
            }
            pst1 = con.prepareStatement("SELECT coursedetails.credit FROM coursedetails WHERE coursedetails.cozId = '"+txtCourseId.getText()+"'" );
            res1= pst1.executeQuery();
            
            int count =0;
            while(res1.next()){
                int  credit = res1.getInt(1);
                if(txtLecAssGrade.getText() == "A"){
                    count = count+ credit*4;
                    
                }else if(txtLecAssGrade.getText() == "B"){
                    count = count+credit*3;
                }
                else if(txtLecAssGrade.getText() == "C"){
                    count = count+credit*2;
                }
                else if(txtLecAssGrade.getText() == "D"){
                    count = count+credit*1;
                }
                if(txtRpoGrade.getText() == "A"){
                    count = count + credit*4;
                }
                else if(txtRpoGrade.getText() == "B"){
                    count = count + credit*3;
                }
                else if(txtRpoGrade.getText() == "C"){
                    count = count + credit*2;
                }
                else if(txtRpoGrade.getText() == "D"){
                    count = count + credit*1;
                }
                if(txtExamGrade.getText() == "A"){
                    count = count + credit*4;
                }
                else if(txtExamGrade.getText() == "B"){
                    count = count + credit*3;
                }
                else if(txtExamGrade.getText() == "C"){
                    count = count + credit*2;
                }
                else if(txtExamGrade.getText() == "D"){
                    count = count + credit*1;
                }
                if(txtPracAssGrade.getText() == "A"){
                    count = count + credit*4;
                }
                else if(txtPracAssGrade.getText() == "B"){
                    count = count + credit*3;
                }
                else if(txtPracAssGrade.getText() == "C"){
                    count = count + credit*2;
                }
                else if(txtPracAssGrade.getText() == "D"){
                    count = count + credit*1;
                }
                if(txtPracProjectGrade.getText() == "A"){
                    count = count + credit*4;
                }
                else if(txtPracProjectGrade.getText() == "B"){
                    count = count + credit*3;
                }
                else if(txtPracProjectGrade.getText() == "C"){
                    count = count + credit*2;
                }
                else if(txtPracProjectGrade.getText() == "D"){
                    count = count + credit*1;
                }
                int gpa = count/credit*6;
               
                txtGpa.setText(Integer.toString(gpa));
                
                
            }
            pst = con.prepareStatement("SELECT registerdetailspart1.email FROM registerdetailspart1 WHERE registerdetailspart1.regId ="+txtRegId.getText());
            
            res= pst.executeQuery();
            while(res.next()){
                String to = res.getString(1);
                
                txtToGmail.setText(to);
                
                 
                
            }
            
            
        }catch(SQLException e){
        }
        
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        
            String host = "mail.javatpoint.com";
            String user ="ucsc1995asangi@gmail.com";
            String password = "abcbcs95@";
            String to = txtToGmail.getText();
            Properties pros = System.getProperties();
            pros.setProperty("mail.smtp.host",host);
            pros.put("mail.smtp.starttls.enable", true);
            pros.put("mail.smtp.host", "smtp.gmail.com");
            pros.put("mail.smtp.socketFactory.port", "465");
            pros.put("mail.smtp.auth", "true");
            pros.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            Session session = Session.getDefaultInstance(pros , 
            new javax.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(user,password);
                }
            });
            try{
                
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(user));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject("Exame result");
                message.setText(txtMessage.getText());
                
                Transport.send(message);
                System.out.println("message sent successfully...");
               
            JOptionPane.showMessageDialog(null, "Message send Succsefully!!!");
            
        
        }
        catch(MessagingException em){
            em.printStackTrace();
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegIdActionPerformed

    private void txtLecAssGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLecAssGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLecAssGradeActionPerformed

    private void txtPracProjectGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPracProjectGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPracProjectGradeActionPerformed

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
            java.util.logging.Logger.getLogger(SendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtExamGrade;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtLecAssGrade;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtNameIni;
    private javax.swing.JTextField txtPracAssGrade;
    private javax.swing.JTextField txtPracExamGrade;
    private javax.swing.JTextField txtPracProjectGrade;
    private javax.swing.JTextField txtRegId;
    private javax.swing.JTextField txtRpoGrade;
    private javax.swing.JTextField txtToGmail;
    // End of variables declaration//GEN-END:variables
}