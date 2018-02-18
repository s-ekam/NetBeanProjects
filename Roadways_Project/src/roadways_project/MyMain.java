/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadways_project;

import java.awt.event.KeyListener;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Ekam
 */
public class MyMain implements mycred{
  
    public static String cuser="";
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        try
        {
            Connection mycon= DriverManager.getConnection(path+place,uname,pass);
            try
            {
                String q="select * from admintable";
                PreparedStatement mstate= mycon.prepareStatement(q);
               
                ResultSet myresult = mstate.executeQuery();
               if(myresult.next())
               {
                   login obj= new login();
                   obj.setVisible(true);
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"First time! Welcome to our App");
                   cadmin obj = new cadmin();
                   obj.setVisible(true);
               }
                
            
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error in Query " + e.getMessage());
            }
            finally
            {
                mycon.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error in connection"+e.getMessage());
        }
//            admin_form obj = new admin_form();
//            obj.setVisible(true);

    }
    
}
