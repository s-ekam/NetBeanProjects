/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadways_project;


import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ekam
 */
public class upbus extends javax.swing.JInternalFrame  implements mycred{

    String[] r;
    String route;
    String rte=null;
    String[] r2;
    
    /**
     * Creates new form addbus
     */
    
    public upbus() {
        initComponents();
        
        jFormattedTextField1.setText(String.valueOf( allbus.bno ));
        jFormattedTextField1.setEnabled(false);
        //genrt();
        try
        {
            Connection mycon = DriverManager.getConnection(path+place,uname, pass);
            try
            {
                String q = "Select * from routedet";
                PreparedStatement mstate = mycon.prepareStatement(q);
                
                ResultSet myres = mstate.executeQuery();
                if(myres.next())
                {
                    do
                    {
                        jComboBox1.addItem(myres.getString("route"));
                    }while(myres.next());
                }
                
                String q2= "select * from employeetable";
                        PreparedStatement mstate2= mycon.prepareStatement(q2);
                        
                        ResultSet myres2 = mstate2.executeQuery();
                        if(myres2.next())
                        {
                            do
                            {
                                if(myres2.getString("post").equalsIgnoreCase("driver"))
                                {
                                    jComboBox2.addItem(myres2.getString("ename"));
                                }
                                if(myres2.getString("post").equalsIgnoreCase("conductor"))
                                {
                                    jComboBox3.addItem(myres2.getString("ename"));
                                }
                            }
                            while(myres2.next());
                        }
                
                String q3="Select * from busdet where busno = ?";
                PreparedStatement myst = mycon.prepareStatement(q3);
                myst.setString(1,String.valueOf(allbus.bno));
                ResultSet mres = myst.executeQuery();
                if(mres.next())
                {
                    jComboBox1.setSelectedItem(mres.getString("route"));
                    jTextField1.setText(mres.getString("company"));
                    if(mres.getString("type").equals("AC"))
                    {
                        jRadioButton1.setSelected(true);
                    }
                    else if(mres.getString("type").equals("non_AC"))
                    {
                        jRadioButton2.setSelected(true);
                    }
                    jComboBox2.setSelectedItem(mres.getString("driver"));
                    jComboBox3.setSelectedItem(mres.getString("conductor"));
                    jTextField2.setText(mres.getString("seats"));
                    jTextField3.setText(mres.getString("fare"));
                    
                    r2= mres.getString("route").split(",");
                    for(int i=0;i<r2.length;i+=2)
                    {
                        if(rte==null)
                        {
                            rte= r2[i];
                        }
                        else
                        {
                            rte+=","+r2[i];
                        }
                    }
                    jComboBox1.setSelectedItem(rte);
                    System.out.println(rte);
                    DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                    mymodel.setRowCount(0);
                    for(int i=0;i<r2.length;i+=2)
                    {
                        mymodel.addRow(new Object[] { r2[i],r2[i+1]} );
                    }
                    
                }
                        
                        
                        
                        
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in query2 : "+e.getMessage());
            }
            finally
            {
                mycon.close();
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error in Connnection :" + e.getMessage());
        }
    }
    
//    public void genrt()
//    {
//         try
//        {
//            Connection mycon = DriverManager.getConnection(path+place,uname, pass);
//            try
//            {
//                String q = "Select max(busno) from busdet";
//                PreparedStatement mstate = mycon.prepareStatement(q);
//                
//                ResultSet myres = mstate.executeQuery();
//                if(myres.next())
//                {
//                    int bn= myres.getInt(1)+1;
//                    jFormattedTextField1.setText(String.valueOf(bn));
//                    
//                }
//            }
//            catch(Exception e)
//            {
//                JOptionPane.showMessageDialog(rootPane,"Error in query1 : "+e.getMessage());
//            }
//            finally
//            {
//                mycon.close();
//            }
//            
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(rootPane,"Error in Connnection :" + e.getMessage());
//        }
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel1.setText("Bus No.");

        jLabel2.setText("route");

        jFormattedTextField1.setEnabled(false);
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Route" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Company");

        jLabel4.setText("Type");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("AC");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("non-AC");

        jLabel5.setText("Driver");

        jLabel6.setText("Conductor");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Driver" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Conductor" }));

        jLabel7.setText("No of Seats");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Base Fare");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2)
                        .addGap(23, 23, 23))
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        int op= JOptionPane.showConfirmDialog(rootPane,"Confirm ?", "Confiramtion",JOptionPane.YES_NO_OPTION);
        if(op == JOptionPane.YES_OPTION)
        {
            for(int i=0;i<jTable1.getRowCount();i++)
            {
                if(route==null)
                {
                    route = jTable1.getValueAt(i,0).toString()+","+jTable1.getValueAt(i, 1);

                }
                else if (route !=null)
                {
                    route +=","+jTable1.getValueAt(i,0).toString()+","+jTable1.getValueAt(i, 1);
                }

            }

            try
            {
                Connection mycon = DriverManager.getConnection(path+place,uname, pass);
                try
                {
                    String q = "update busdet set  route =?,company=?,type=?,driver=?,conductor=?,seats=?,fare=? where busno=?";
                    PreparedStatement mstate = mycon.prepareStatement(q);

                    mstate.setString(8,jFormattedTextField1.getText());
                    mstate.setString(1,route);
                    mstate.setString(2,jTextField1.getText());
                    if(jRadioButton1.isSelected())
                    {
                        mstate.setString(3,"AC");
                    }
                    else if(jRadioButton2.isSelected())
                    {
                        mstate.setString(3,"non_AC");
                    }
                        mstate.setString(4,jComboBox2.getSelectedItem().toString());
                        mstate.setString(5,jComboBox3.getSelectedItem().toString());
                        mstate.setString(6,jTextField2.getText());
                        mstate.setString(7,jTextField3.getText());
                    if(mstate.executeUpdate()>0)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Bus updated Successfully");
                        this.dispose();
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in query : "+e.getMessage());
                }
                finally
                {
                    mycon.close();
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Connnection :" + e.getMessage());
            }
        }
 //       genrt();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        r= jComboBox1.getSelectedItem().toString().split(",");
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
            mymodel.setRowCount(0);
        for(int i=0;i<r.length;i++)
        {
            mymodel.addRow(new Object[] { r[i]} );
        }
        


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
