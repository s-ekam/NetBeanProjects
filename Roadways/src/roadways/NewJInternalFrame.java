/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadways;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Gaganpreet Singh
 */
public class NewJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public NewJInternalFrame() {
        
        initComponents();
        
        
          try
        {
            Connection myconnection;
            String path="jdbc:mysql://localhost/";
            String place="roadwaysdb";
            String username="root";
            String password="";
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String q="select *from source_city ";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                
                 
                 ResultSet myresult=mystatement.executeQuery();
                
               
                 
                if(myresult.next())
                {
                    do
                    {
                        jComboBox1.addItem(myresult.getString("source"));
                    }
                    while(myresult.next());
                }
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(rootPane,"error in query "+ e.getMessage());
            }
            
            try
            {
                String q="select * from destination_city ";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                
                 
                 ResultSet myresult=mystatement.executeQuery();
                
               
                 
                if(myresult.next())
                {
                    do
                    {
                    jComboBox2.addItem(myresult.getString("destination"));
                    }
                    while(myresult.next());
                }
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(rootPane,"error in query "+ e.getMessage());
            }
            
              try
            {
                String q="select * from company ";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                
                 
                 ResultSet myresult=mystatement.executeQuery();
                
               
                 
                if(myresult.next())
                {
                    do
                    {
                    jComboBox3.addItem(myresult.getString("company"));
                    }
                    while(myresult.next());
                }
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(rootPane,"error in query "+ e.getMessage());
            }
            
            
            finally
                    {
                        myconnection.close();
                    }
        }
            catch(Exception e)
                    {
                      JOptionPane.showMessageDialog(rootPane,"error in connection  "+ e.getMessage());
                    }
                
                
        

                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        jLabel1.setText("Company");

        jLabel2.setText("number of seats");

        jLabel3.setText("AC OR NON-AC");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("AC");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("NON-AC");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("source");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose city" }));

        jLabel5.setText("destination");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose city" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose company" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(201, 201, 201))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(120, 120, 120))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Connection myconnection;
            String path="jdbc:mysql://localhost/";
            String place="roadwaysdb";
            String username="root";
            String password="";
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String q="insert into booking tb values(?,?,?,?,?)";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1, jComboBox1.getSelectedItem().toString());
                 mystatement.setString(2, jComboBox2.getSelectedItem().toString());
                  mystatement.setString(3, jComboBox3.getSelectedItem().toString());
                 
                 mystatement.setString(5, jFormattedTextField2.getText());
                
                if(jRadioButton1.isSelected())
                {
                    mystatement.setString(4, "AC");
                }
                else if(jRadioButton1.isSelected())
                {
                    mystatement.setString(4, " NON-AC");
                }
                 
                if(mystatement.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Record stored successfully");
                }
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(rootPane,"error in query "+ e.getMessage());
            }
            finally
                    {
                        myconnection.close();
                    }
        }
            catch(Exception e)
                    {
                      JOptionPane.showMessageDialog(rootPane,"error in connection  "+ e.getMessage());
                    }
                
                
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
