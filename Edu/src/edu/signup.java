/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;

import static edu.MainLogin.paswrd;
import static edu.MainLogin.user;
import static edu.mycred.pass;
import static edu.mycred.path;
import static edu.mycred.place;
import static edu.mycred.uname;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ekam
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    SimpleDateFormat myfor;
    public signup() {
        initComponents();
        jComboBox1.addItem("Select Class");
         try
        {
            Connection mycon= DriverManager.getConnection(path+place,uname,pass);
            try
            {
                String q="select * from classes";
                PreparedStatement mstate= mycon.prepareStatement(q);
                
                ResultSet myres = mstate.executeQuery();
                
                if(myres.next())
                {
                   do
                        {
                                jComboBox1.addItem(myres.getString("classname"));
                            
                        }
                        while(myres.next());
                }
//               
                    else
                    {
                       JOptionPane.showMessageDialog(rootPane," Invalid username / password ");
                    }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error Updating Query : "+e.getMessage());
            }
            finally
            {
                mycon.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error in connection "+e.getMessage());
        }
        this.setExtendedState(MAXIMIZED_BOTH);
        jDesktopPane1.setSize(MAXIMIZED_HORIZ,MAXIMIZED_VERT);
      jTextField1.setText(MainLogin.user);
      jPasswordField1.setText(MainLogin.paswrd);
        myfor= new SimpleDateFormat("yyyy-MM-dd");
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 135, 140, 37);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 186, 140, 37);

        jLabel3.setText("First Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 241, 140, 40);

        jLabel4.setText("Re-Enter Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(711, 299, 110, 40);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 299, 140, 40);

        jLabel6.setText("Last Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(711, 241, 133, 40);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(372, 133, 238, 37);

        jPasswordField1.setEditable(false);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(372, 185, 238, 38);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(372, 242, 238, 37);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(849, 242, 199, 37);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(372, 300, 238, 37);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(849, 300, 199, 37);

        jLabel7.setText("Phone");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 419, 140, 40);

        jLabel8.setText("Address");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 507, 140, 40);

        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(372, 690, 238, 50);

        jLabel10.setText("Class");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 359, 140, 40);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(370, 360, 240, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(372, 489, 238, 96);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("1");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(58, 34, 184, 56);
        getContentPane().add(jCalendar1);
        jCalendar1.setBounds(849, 419, 357, 204);

        jLabel12.setText("DOB");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(711, 480, 133, 35);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(370, 419, 240, 40);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1260, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String em=jTextField5.getText();
        if(!em.equals(jTextField4.getText()))
        {
            JOptionPane.showMessageDialog(null,"enter email again");
        }
        String dob= myfor.format(jCalendar1.getDate());
        if(jComboBox1.getSelectedIndex()==1)
        {
            JOptionPane.showMessageDialog(rootPane, "Select Class");
        }
        if(jTextField6.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter Valid Phone Number");
        }
        else
        {
         try
        {
            Connection mycon = DriverManager.getConnection(path+place,uname,pass);
            try
            {
                String q="insert into signup values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement mystate = mycon.prepareStatement(q);
                mystate.setString(1,MainLogin.user);
                mystate.setString(2,MainLogin.paswrd);
                mystate.setString(3,jTextField2.getText());
                mystate.setString(4,jTextField3.getText());
                mystate.setString(5,jTextField4.getText());
                mystate.setString(6,jComboBox1.getSelectedItem().toString());
                mystate.setInt(7,Integer.parseInt(jTextField6.getText()));
                mystate.setString(8,jTextArea1.getText());
                mystate.setString(9,dob);
                if(mystate.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "New Student Addded");
                    
                    String q1="insert into login values(?,?,?)";
                    PreparedStatement mystate2 = mycon.prepareStatement(q1);
                    mystate2.setString(1,MainLogin.user);
                    mystate2.setString(2,MainLogin.paswrd);
                    mystate2.setString(3,"student");
                    if(mystate2.executeUpdate()>0)
                    {
                        MainLogin obj = new MainLogin();
                        obj.setVisible(true);
                        this.dispose();
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Query "+ e.getMessage());
                
            }
            finally
            {
                mycon.close();
            }
                
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error establishing Connection " + e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
