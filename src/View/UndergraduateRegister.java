/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.DepartmentController.searchDepartmentByDepartmentName;
import static Controller.UndergraduateController.deleteUndergraduate;
import static Controller.UndergraduateController.insertUndergraduatePersonal;
import static Controller.UndergraduateController.searchUndergraduateByNIC;
import Model.Course;
import static Model.Season.eligibleFebruarySeason;
import static Model.Season.eligibleJulySeason;
import Model.Undergraduate;
import static View.EnrollementSystemHome.depid;
import static View.EnrollementSystemHome.hm;
import static View.UndergraduateLogin.un;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asitha
 */
public class UndergraduateRegister extends javax.swing.JFrame {

    public static Course cs;
    public static UndergraduateCourseRegister unCourse;
    public UndergraduateRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        nicTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        telephoneTxt = new javax.swing.JTextField();
        alResultTxt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        indexTxt = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        alStreamTxt = new javax.swing.JComboBox<>();
        securityQ = new javax.swing.JComboBox<>();
        answerTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dateChooserBtn = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Undergraduate Personal Details Register");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel1.setText("Education Qualifications Advance Level");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel2.setText("Full Name");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel3.setText("National Identity Card Number");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel4.setText("Telephone");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel5.setText("Date Of Birth");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel6.setText("Address");

        nameTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        nicTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        addressTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        telephoneTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        alResultTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        alResultTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A A A", "A A B", "A B B", "B B B", "B B C", "B C C", "C C C", "C C S", "C S S", "S S S" }));
        alResultTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel7.setText("Examination Index Number Advance Level");

        indexTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        nextBtn.setFont(new java.awt.Font("Ubuntu", 1, 19)); // NOI18N
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next2.png"))); // NOI18N
        nextBtn.setText("Next");
        nextBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Ubuntu", 1, 19)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close5.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel8.setText("Advance Level Stream");

        alStreamTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        alStreamTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combined Mathematics", "Biological Science", "Commerce", "Arts", "Tech" }));
        alStreamTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        securityQ.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        securityQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is you mother's maiden name?", "What is your teacher's name?", "What is your street name?", "What is your best friend's name?", "What is your father's surname?" }));

        answerTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel12.setBackground(new java.awt.Color(0, 102, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);

        department.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Of Computing", "School Of Engineering", "School Of Business" }));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel9.setText("Select Department");
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel10.setText("Email");

        emailTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        jLabel11.setText("Undergraduate Personal Details Register");

        dateChooserBtn.setToolTipText("ex: 08-Aug-2018");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(368, 368, 368)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telephoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(nextBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(138, 138, 138)
                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(securityQ, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alResultTxt, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indexTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alStreamTxt, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(221, 221, 221)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChooserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                            .addComponent(nicTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nicTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateChooserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephoneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alResultTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indexTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alStreamTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(answerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(securityQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        try {
            this.dispose();
            
            deleteUndergraduate(un);
            hm.setVisible(true);
            hm.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_closeBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        try {
            // Add student in to the databse
            String name=nameTxt.getText();
            String nic=nicTxt.getText();
            String dob=1900+dateChooserBtn.getDate().getYear()+"-"+(dateChooserBtn.getDate().getMonth()+1)+"-"+dateChooserBtn.getDate().getDate();
            System.out.println(dob);
            String address=addressTxt.getText();
            String telephone=telephoneTxt.getText();
            String alResult=(String)alResultTxt.getSelectedItem();
            String alIndex=indexTxt.getText();
            String alStream=(String)alStreamTxt.getSelectedItem();
            String sequrity=(String)securityQ.getSelectedItem();
            String answer=(String)answerTxt.getText();
            String email=(String)emailTxt.getText();
            depid=searchDepartmentByDepartmentName((String)department.getSelectedItem()).getDepartmentID();
            
            un=new Undergraduate();
            un.setName(name);
            un.setNic(nic);
            un.setDob(dob);
            un.setAddress(address);
            un.setTelephone(telephone);
            un.setAlResult(alResult);
            un.setAlIndex(alIndex);
            un.setAlStream(alStream);
            un.setSecurity(sequrity);
            un.setAnswer(answer);
            un.setDepID(depid);
            un.setEmail(email);
            
            if(insertUndergraduatePersonal(un)>0){
                JOptionPane.showMessageDialog(rootPane, "You have succefully registered!!!");
                un.setId(searchUndergraduateByNIC(un.getNic()));
                JOptionPane.showMessageDialog(rootPane, "Your ID: "+un.getId()+"\nYour password: NIC number");
                
                if(eligibleFebruarySeason()||eligibleJulySeason()){
                    this.setVisible(false);
                    unCourse=new UndergraduateCourseRegister();
                    unCourse.setVisible(true);
                    unCourse.setLocationRelativeTo(null);
                }
                
                else{
                    JOptionPane.showMessageDialog(rootPane, "You can register only in january and july seasons only");
                    JOptionPane.showMessageDialog(rootPane, "Your records have deleted");
                    deleteUndergraduate(un);//delete Undergraduate object
                    this.dispose();
                    hm.setVisible(true);
                    hm.setLocationRelativeTo(null);  
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_nextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UndergraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UndergraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UndergraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UndergraduateRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UndergraduateRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JComboBox<String> alResultTxt;
    private javax.swing.JComboBox<String> alStreamTxt;
    private javax.swing.JTextField answerTxt;
    private javax.swing.JButton closeBtn;
    private com.toedter.calendar.JDateChooser dateChooserBtn;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField indexTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JComboBox<String> securityQ;
    private javax.swing.JTextField telephoneTxt;
    // End of variables declaration//GEN-END:variables
}
