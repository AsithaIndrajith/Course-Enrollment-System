/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.CourseController.searchCourseID;
import static Controller.CourseController.searchCourseIDD;
import static Controller.UndergraduateController.deleteUndergraduate;
import static Controller.UndergraduateController.insertUndergraduatePersonal;
import static Controller.UndergraduateController.searchUndergraduateID;
import Model.Course;
import static Model.StudentSubject.getTime;
import Model.Undergraduate;
import static View.Home.depid;
import static View.Home.hm;
import static View.UndergraduateLogin.un;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
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
        camcelBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        alStreamTxt = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        date = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        securityQ = new javax.swing.JComboBox<>();
        answerTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel1.setText("Education Qualifications Advance Level");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel3.setText("National Identity Card Number");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel4.setText("Telephone");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel5.setText("Date Of Birth");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel6.setText("Address");

        nameTxt.setPreferredSize(new java.awt.Dimension(50, 50));
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        nameTxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nameTxtPropertyChange(evt);
            }
        });

        nicTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        addressTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        telephoneTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        alResultTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        alResultTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A A A", "A A B", "A B B", "B B B", "B B C", "B C C", "C C C", "C C S", "C S S", "S S S" }));
        alResultTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel7.setText("Examination Index Number Advance Level");

        indexTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        nextBtn.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        camcelBtn.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        camcelBtn.setText("CANCEL");
        camcelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camcelBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel8.setText("Advance Level Stream");

        alStreamTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        alStreamTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combined Mathematics", "Biological Science", "Commerce", "Arts", "Tech" }));
        alStreamTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        year.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        year.setPreferredSize(new java.awt.Dimension(50, 50));
        year.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                yearMouseMoved(evt);
            }
        });

        date.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        date.setPreferredSize(new java.awt.Dimension(50, 50));
        date.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dateMouseMoved(evt);
            }
        });
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        month.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "Sepetember", "Octomber", "November", "December" }));
        month.setPreferredSize(new java.awt.Dimension(50, 50));
        month.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                monthMouseMoved(evt);
            }
        });

        securityQ.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        securityQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is you mother's maiden name?", "What is your teacher's name?", "What is your street name?", "What is your best friend's name?", "What is your father's surname?" }));

        answerTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(camcelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(securityQ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(answerTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indexTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telephoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nicTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(alResultTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alStreamTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nicTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telephoneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alResultTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indexTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alStreamTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(answerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(securityQ))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(camcelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camcelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camcelBtnActionPerformed
        this.setVisible(false);
        try {
            deleteUndergraduate(un);
            hm.setVisible(true);
            hm.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduatePayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduatePayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_camcelBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        String name=nameTxt.getText();
        String nic=nicTxt.getText();
        String dob=(String)year.getSelectedItem()+"-"+(String)month.getSelectedItem()+"-"+(String)date.getSelectedItem();
        String address=addressTxt.getText();
        String telephone=telephoneTxt.getText();
        String alResult=(String)alResultTxt.getSelectedItem();
        String alIndex=indexTxt.getText();
        String alStream=(String)alStreamTxt.getSelectedItem();
        String sequrity=(String)securityQ.getSelectedItem();
        String answer=(String)answerTxt.getText();
        
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
        try {
                if((name.equals("")||nic.equals("")||address.equals("")||telephone.equals("")||alIndex.equals(""))){
                    JOptionPane.showMessageDialog(rootPane, "Required feilds can't be empty.");
                }
                else{
                int res=insertUndergraduatePersonal(un);
                if(res>0){
                    un.setId(searchUndergraduateID(un.getNic()));
                    JOptionPane.showMessageDialog(rootPane, "Your personal details collected.\n"+"Your ID: "+un.getId()+"\nYour password is your NIC");
                    this.setVisible(false);
                    unCourse=new UndergraduateCourseRegister();
                    unCourse.setVisible(true);
                    unCourse.setLocationRelativeTo(null);
                    if(((Integer.parseInt(getTime().substring(0,2))-1)*30+Integer.parseInt(getTime().substring(3,5)))>167&&((Integer.parseInt(getTime().substring(0,2))-1)*30+Integer.parseInt(getTime().substring(3,5)))<182){
                        unCourse.getSelectSemester().setSelectedIndex(2);
                        unCourse.getSelectSemester().setEditable(false);
                        unCourse.getSelectSemester().setEnabled(false);
                    }
                    ArrayList<Course> cs=new ArrayList<Course>();
                    cs=searchCourseIDD(depid,"U");
                    
                    String lis[]=new String[cs.size()];
                    for(int i=0;i<cs.size();i++){
                        lis[i]=cs.get(i).getName();
                    }
                    unCourse.getSelectCourse().setModel(new DefaultComboBoxModel<>(lis));
                    }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Try again later");
                }
                }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            System.out.println(e);
       }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void yearMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_yearMouseMoved

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nameTxtActionPerformed

    private void nameTxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nameTxtPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_nameTxtPropertyChange

    private void monthMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthMouseMoved
       
    }//GEN-LAST:event_monthMouseMoved

    private void dateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseMoved
        
    }//GEN-LAST:event_dateMouseMoved

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
    private javax.swing.JButton camcelBtn;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JTextField indexTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JComboBox<String> securityQ;
    private javax.swing.JTextField telephoneTxt;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
