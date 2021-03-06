/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.DepartmentController.searchDepartmentByDepartmentName;
import static Controller.UndergraduateController.searchUndergraduateByStudentID;
import static Controller.UndergraduateController.updateUndergraduateYear;
import Model.Undergraduate;
import static View.EnrollementSystemHome.depid;
import static View.EnrollementSystemHome.hm;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asitha
 */
public class UndergraduateLogin extends javax.swing.JFrame {

    /**
     * Creates new form UndergraduateLogin
     */
   
    public static UndergraduateHome unHm;
    public static Undergraduate un;
    public static UndergraduateRegister unR;
    
    public UndergraduateLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        signIn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        renewBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        submitBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        paswdTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDTxt = new javax.swing.JTextField();
        sec = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Undergraduate Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        password.setMaximumSize(new java.awt.Dimension(50, 50));
        password.setMinimumSize(new java.awt.Dimension(50, 50));
        password.setPreferredSize(new java.awt.Dimension(50, 50));

        signIn.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signInBtn.png"))); // NOI18N
        signIn.setText("Sign In");
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signIn.setPreferredSize(new java.awt.Dimension(100, 50));
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close5.png"))); // NOI18N
        cancelBtn.setText("Close");
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cancelBtn.setPreferredSize(new java.awt.Dimension(100, 50));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel2.setText("Password");

        username.setMaximumSize(new java.awt.Dimension(50, 50));
        username.setMinimumSize(new java.awt.Dimension(50, 50));
        username.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel12.setBackground(new java.awt.Color(0, 102, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel3.setText("Select Department");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));

        department.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Of Computing", "School Of Engineering", "School Of Business" }));

        renewBtn.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        renewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registration-(1).png"))); // NOI18N
        renewBtn.setText("Renew");
        renewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        renewBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        renewBtn.setPreferredSize(new java.awt.Dimension(100, 50));
        renewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(renewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signIn, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Undergraduate Login", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        submitBtn.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        submitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search1.png"))); // NOI18N
        submitBtn.setText("Search");
        submitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        submitBtn.setMaximumSize(new java.awt.Dimension(100, 50));
        submitBtn.setMinimumSize(new java.awt.Dimension(100, 50));
        submitBtn.setPreferredSize(new java.awt.Dimension(100, 50));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel5.setText("Your password");

        paswdTxt.setBackground(new java.awt.Color(255, 0, 0));
        paswdTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        paswdTxt.setForeground(new java.awt.Color(255, 255, 255));
        paswdTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        paswdTxt.setMaximumSize(new java.awt.Dimension(50, 50));
        paswdTxt.setMinimumSize(new java.awt.Dimension(50, 50));
        paswdTxt.setOpaque(true);
        paswdTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel6.setText("What is you ID");

        IDTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        IDTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        sec.setBackground(new java.awt.Color(0, 153, 0));
        sec.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        sec.setForeground(new java.awt.Color(255, 255, 255));
        sec.setText("Your sequrity question will displyed here");
        sec.setOpaque(true);

        ans.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search1.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 102, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sec)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ans, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paswdTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paswdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Forgot your password?", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Undergraduate temp=new Undergraduate();
            
            temp=searchUndergraduateByStudentID(IDTxt.getText());
            if(temp!=null){
                un=new Undergraduate();
                un=temp;
                sec.setText(temp.getSecurity());
            }
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if(ans.getText().equals(un.getAnswer())){
            paswdTxt.setText(un.getPassword());
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Sorry answer is not correct");
            ans.setText("");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        hm.setVisible(true);
        hm.setLocationRelativeTo(null);
        

    }//GEN-LAST:event_cancelBtnActionPerformed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        try {
            // TODO add your handling code here:
            EnrollementSystemHome.depid=searchDepartmentByDepartmentName((String)department.getSelectedItem()).getDepartmentID();
            
            String id = username.getText();
            String pswd=password.getText();

            un=new Undergraduate();
            un=searchUndergraduateByStudentID(id);
            if(un.getId().equals(id)&&un.getPassword().equals(pswd)&&un.getDepID().equals(depid)){
                JOptionPane.showMessageDialog(jPanel1, "Sign In Success");
                this.setVisible(false);
                unHm=new UndergraduateHome();
                unHm.setVisible(true);
                unHm.setLocationRelativeTo(null);

            }
            else{
                JOptionPane.showMessageDialog(jPanel1, "Sign In Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateLogin.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NullPointerException n){
            JOptionPane.showMessageDialog(rootPane, "Invalid Login!!!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_signInActionPerformed

    private void renewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewBtnActionPerformed
    
        try {
            
            EnrollementSystemHome.depid=searchDepartmentByDepartmentName((String)department.getSelectedItem()).getDepartmentID();
            
            String id = username.getText();
            String pswd=password.getText();

            un=new Undergraduate();
            un=Controller.UndergraduateController.searchUndergraduateByStudentID(id);
            if(un.getId().equals(id)&&un.getPassword().equals(pswd)&&un.getDepID().equals(depid)){
                JOptionPane.showMessageDialog(jPanel1, "Sign In Success");
                UndergraduateCourseRegister courseRegister=new UndergraduateCourseRegister();
                this.setVisible(false);
                courseRegister.setVisible(true);
                courseRegister.setLocationRelativeTo(null);
                courseRegister.getSelectYear().setSelectedIndex(Integer.parseInt(un.getYear()));
                courseRegister.getSelectYear().setEditable(false);
                courseRegister.getSelectYear().setEnabled(false);
                updateUndergraduateYear(un.getId(),un.getYear()+1);

            }
            else{
                JOptionPane.showMessageDialog(jPanel1, "Sign In Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateLogin.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NullPointerException n){
            JOptionPane.showMessageDialog(rootPane, "Invalid Login!!!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
        
    }//GEN-LAST:event_renewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UndergraduateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UndergraduateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UndergraduateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UndergraduateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UndergraduateLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTxt;
    private javax.swing.JTextField ans;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel paswdTxt;
    private javax.swing.JButton renewBtn;
    private javax.swing.JLabel sec;
    private javax.swing.JButton signIn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    
}
