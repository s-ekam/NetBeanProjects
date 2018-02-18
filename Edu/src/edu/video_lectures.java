/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu;

import static edu.mycred.pass;
import static edu.mycred.path;
import static edu.mycred.place;
import static edu.mycred.uname;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author Ekam
 */
public class video_lectures extends javax.swing.JFrame {

    /**
     * Creates new form video_lectures
     */
    String title;
    int rows;
    Vector<String> t=new Vector<String>();
    Vector<String> l = new Vector<String>();
    public video_lectures() {
        initComponents();
        //jLabel1.setText("VIDEO LECTURES OF ");
//        title="abc";
//        try
//        {
//            Connection mycon = DriverManager.getConnection(path+place,uname,pass);
//            try
//            {
//                String q="Select count(*) as rows from videos where topic =?";
//                PreparedStatement mystate = mycon.prepareStatement(q);
//                mystate.setString(1,title);
//                ResultSet mres = mystate.executeQuery();
//                
//                
//                if(mres.next())
//                {
//                    System.out.println(mres.getInt("rows"));
//                }
//            }
//            catch(Exception e)
//            {
//                JOptionPane.showMessageDialog(rootPane,"Error in Query "+ e.getMessage());
//                
//            }
//            finally
//            {
//                mycon.close();
//            }
//                
//            
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(rootPane,"Error establishing Connection " + e.getMessage());
//        }
        
    }
    public video_lectures(String str) {
        initComponents();
        title=str;
        jLabel1.setText("VIDEO LECTURES OF "+title);
        
        try
        {
            Connection mycon = DriverManager.getConnection(path+place,uname,pass);
            try
            {
                String q="Select count(*) as rows from videos where topic =?";
                PreparedStatement mystate = mycon.prepareStatement(q);
                mystate.setString(1,title);
                ResultSet mres = mystate.executeQuery();
                
                
                if(mres.next())
                {
                    rows=mres.getInt("rows");
                    System.out.println(rows);
                    
                    String q2="Select * from videos where topic = ? ";
                    PreparedStatement mystate2 = mycon.prepareStatement(q2);
                    //System.out.println(1);
                    mystate2.setString(1,title);
                    //System.out.println(2);
                    ResultSet mrest = mystate2.executeQuery();
                    //System.out.println(3);
                    if(mrest.next())
                    {
                       
                        do
                        {
                            t.add(mrest.getString("topic"));
                            l.add(mrest.getString("video_link"));
                        }
                        while(mrest.next());
                    }
                    JButton[] jbblocked=new JButton[rows];
                    
			for(int i=0;i<rows;i++){
                            int a=-100;

				jbblocked[i]=new JButton(t.get(i).toString());
                                
                                //jbblocked[i].setSize(20,50);
                                
				jbblocked[i].setToolTipText("Click to Play");

				//jbblocked[i].setBounds(20+((i-1)%3)*(100+(width-340)/2),20+((i-1)/3)*30,100,20);
                                jbblocked[i].setBounds(100+a, 50,50, 50);
                                String bn = l.get(i).toString();

				jbblocked[i].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ev){
						try{
                                                    
                                                    Runtime.getRuntime().exec("C:\\Program Files\\VideoLAN\\VLC\\vlc.exe " + bn );
                                                }
                                                catch(Exception ex){
                                                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                                                    
                                                }
						
						}
					}
				);
                                
                                
				jPanel1.add(jbblocked[i]);
                                jbblocked[i].setVisible(true);
                                a+=100;
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setText("        VIDEO LECTURES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(video_lectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(video_lectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(video_lectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(video_lectures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new video_lectures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
