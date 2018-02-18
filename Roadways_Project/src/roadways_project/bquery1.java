/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadways_project;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ekam
 */
public class bquery1 extends javax.swing.JInternalFrame implements mycred{

    
    int seat,rseat,a,b,c;
    double cost,stp;
    String r1;
    public static String[] s = new String[10];
    SimpleDateFormat myformat;
    String m,n,o;
    int e=0,f=0,g;
    
    

    /**
     * Creates new form NewJInternalFrame
     */
    public bquery1() {
        
        initComponents();
        myformat = new SimpleDateFormat("yyyy-MM-dd");
        
        
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jFormattedTextField2.setEditable(false);
        
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        
        genrt();
        int seat,rseat;
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jButton1.setVisible(false);
        jLabel8.setVisible(false);
        jComboBox1.addItem("Select Departure City");
        jComboBox2.addItem("Select Departure City First");
        jLabel9.setVisible(false);
        
        jFormattedTextField3.setVisible(false);
        jFormattedTextField3.setEditable(false);
        
        try
        {
            Connection mycon=DriverManager.getConnection(path+place, uname, pass);
            try
            {
               
                String q = "select * from stopsdb  ";
                PreparedStatement mystate = mycon.prepareStatement(q);
                ResultSet myres = mystate.executeQuery();
                if(myres.next())
                {
                    do
                    {
                        jComboBox1.addItem(myres.getString("stopname"));
                    }
                    while(myres.next());
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Query "+e.getMessage());
                
            }
            finally
            {
                mycon.close();
            }
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(rootPane,"error in connection  "+ e.getMessage());
        }
          
        

                
    }
    
    public bquery1(String[] st) {
        
        initComponents();
        SimpleDateFormat myfromat = new SimpleDateFormat("yyyy-MM-dd");
        
        genrt();
        int seat,rseat;
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jFormattedTextField2.setEnabled(false);
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jButton1.setVisible(false);
        jLabel8.setVisible(false);
        jComboBox1.addItem("Select Departure City");
        jComboBox2.addItem("Select Departure City First");
        try
        {
            Connection mycon=DriverManager.getConnection(path+place, uname, pass);
            try
            {
               
                String q = "select * from stopsdb  ";
                PreparedStatement mystate = mycon.prepareStatement(q);
                ResultSet myres = mystate.executeQuery();
                if(myres.next())
                {
                    do
                    {
                        jComboBox1.addItem(myres.getString("stopname"));
                    }
                    while(myres.next());
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Query "+e.getMessage());
                
            }
            finally
            {
                mycon.close();
            }
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(rootPane,"error in connection  "+ e.getMessage());
        }
        

        jComboBox1.setSelectedItem(st[1]);
        jComboBox2.setSelectedItem(st[2]);
        

                
    }
    
    public void genrt()
    {
         try
        {
            Connection mycon = DriverManager.getConnection(path+place,uname, pass);
            try
            {
                String q = "Select max(bookingno) from booktable";
                PreparedStatement mstate = mycon.prepareStatement(q);
                
                ResultSet myres = mstate.executeQuery();
                if(myres.next())
                {
                    int bn= myres.getInt(1)+1;
                    jFormattedTextField2.setText(String.valueOf(bn));
                    
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in query1 : "+e.getMessage());
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Company Name");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose city" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Type");

        jLabel5.setText("destination");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Non - AC");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose city" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("AC");

        jLabel1.setText("Booking No");

        jLabel6.setText("No of Tickets");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BUS No", "Route", "Company", "Type", "Seats Available"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Bus No");

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("source");

        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Price");

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jFormattedTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jFormattedTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jFormattedTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jFormattedTextField2)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton2)
                                        .addGap(91, 91, 91)
                                        .addComponent(jRadioButton1)
                                        .addGap(54, 54, 54))
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        s[0]=jFormattedTextField2.getText();
        s[1]=jComboBox1.getSelectedItem().toString();
        s[2]=jComboBox2.getSelectedItem().toString();
        s[3]=jTextField2.getText();
        if(jRadioButton1.isSelected())
        {
            s[4]="AC";
        }
        else if(jRadioButton2.isSelected())
        {
            s[4]="non-AC";
        }
        s[5]=jFormattedTextField1.getText();
        s[6]=r1;
        s[7]=myformat.format(jDateChooser1.getDate());
        s[8]= jFormattedTextField3.getText();
        s[9]= jTextField3.getText();
        booking obj = new booking();
        jDesktopPane1.add(obj);
        obj.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed

                rseat =Integer.parseInt(jFormattedTextField1.getText());
                
                if(rseat <= seat)
                {
                    jLabel8.setVisible(true);
                    jLabel8.setForeground(Color.GREEN);
                    jLabel8.setText("Seats Available");
                    jLabel9.setVisible(true);
                    jFormattedTextField3.setVisible(true);
                    
                    try
                    {
                        Connection mycon=DriverManager.getConnection(path+place, uname, pass);
                        try
                        {

                            String q2 = "select * from busdet where busno=?  ";
                            PreparedStatement mystate2 = mycon.prepareStatement(q2);

                            mystate2.setString(1,jTextField2.getText());
                            ResultSet mres = mystate2.executeQuery();

                            if(mres.next())
                            {
                                b=mres.getInt("fare");
                            }
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(rootPane,"Error in Query "+e.getMessage());

                        }

                        finally
                        {
                            mycon.close();
                        }
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane,"error in connection  "+ e.getMessage());
                    }
                    
                    a=Integer.parseInt(jFormattedTextField1.getText());
                    
                    cost = Math.ceil(a*b*stp);
                    jFormattedTextField3.setText(String.valueOf(cost));
                    jButton1.setVisible(true);
                    this.revalidate();
                }
                
                else if (rseat>seat)
                {
                        jLabel8.setVisible(true);
                        jLabel8.setForeground(Color.red);
                        jLabel8.setText("Seats Not Available");
                        jButton1.setVisible(false);
                }
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        jTextField2.setText(jTable1.getValueAt(row,0).toString());
        r1= jTable1.getValueAt(row,1).toString();
            jTextField3.setText(jTable1.getValueAt(row,2).toString());
            if(jTable1.getValueAt(row,3).toString().equals("AC"))
            {
                jRadioButton2.setSelected(true);
            }
            else if(jTable1.getValueAt(row,3).toString().equals("non_AC"))
            {
                jRadioButton1.setSelected(true);
            }
                
        c=r1.length();
        a=r1.indexOf(jComboBox1.getSelectedItem().toString());
        if(jComboBox2.getSelectedIndex()>0)
        {
            b=r1.indexOf(jComboBox2.getSelectedItem().toString())+jComboBox2.getSelectedItem().toString().length()+9;
            if(b>c)
            {
                r1=r1.substring(a);
            }
            else
            {
                r1=r1.substring(a,b);
            }
        }
        else
        {
            r1=r1.substring(a);
        }
        c=0;
        b=r1.indexOf(jComboBox2.getSelectedItem().toString());
        r1=r1.replaceAll("    ",",");
        for(int i=0;i<r1.lastIndexOf(",",b);i++)
        {
            i=r1.indexOf(",",i) ;
            c++ ;
        }
        stp=c;
        stp/=2;
        JOptionPane.showMessageDialog(rootPane,r1);
        jFormattedTextField1.setText("");
        jFormattedTextField3.setText("");
        jFormattedTextField3.setVisible(false);
        jLabel9.setVisible(false);
        seat = Integer.parseInt(jTable1.getValueAt(row,4).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        if(jComboBox1.getSelectedIndex()>0)
        {
            e=0;
            DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
            mymodel.setRowCount(0);
            try
            {
                Connection mycon=DriverManager.getConnection(path+place, uname, pass);
                try
                {
                    
                    
                    String q2 = "select * from busdet where route like ?  ";
                    PreparedStatement mystate2 = mycon.prepareStatement(q2);

                    mystate2.setString(1,"%"+jComboBox1.getSelectedItem().toString()+"%"+jComboBox2.getSelectedItem()+"%");
                    ResultSet mres = mystate2.executeQuery();

                    if(mres.next())
                    {

                        do
                        {
                            //mymodel.addRow(new Object[] {mres.getString("busno"),mres.getString("route").replaceAll(",","    "),mres.getString("company"),mres.getString("type"),mres.getString("seats")});
                            m=mres.getString("busno");
                            
                            String q= "select * from booktable where bdate=? and busno=? ";
                            PreparedStatement mstate = mycon.prepareStatement(q);
                            mstate.setString(1,myformat.format(jDateChooser1.getDate()));
                            mstate.setString(2,m);
                            ResultSet myres=mstate.executeQuery();
                            if(myres.next())
                            {
                                do
                                {
                                    e+= myres.getInt("notickets");
                                }
                                while(myres.next());
                                f=mres.getInt("seats");
                                g=f-e;
                            }
                            else
                            {
                                g=mres.getInt("seats");
                            }
                        
                            mymodel.addRow(new Object[] {mres.getString("busno"),mres.getString("route").replaceAll(",","    "),mres.getString("company"),mres.getString("type"),String.valueOf(g)});

                        }
                        while(mres.next());
                    }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in Query "+e.getMessage());

                }

                finally
                {
                    mycon.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"error in connection  "+ e.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        if(jComboBox1.getSelectedIndex()>0)
        {
            DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
            mymodel.setRowCount(0);
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Choose Destination City");
            try
            {
                Connection mycon=DriverManager.getConnection(path+place, uname, pass);
                try
                {

                    String q = "select * from stopsdb ";
                    PreparedStatement mystate = mycon.prepareStatement(q);
                    ResultSet myres = mystate.executeQuery();
                    if(myres.next())
                    {
                        do
                        {
                            if(myres.getString("stopname").equals(jComboBox1.getSelectedItem()))
                            {
                                continue;
                            }
                            else
                            {
                                jComboBox2.addItem(myres.getString("stopname"));
                            }
                        }
                        while(myres.next());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,"No bus available For this Route");
                    }

                    String q2 = "select * from busdet where route like ?  ";
                    PreparedStatement mystate2 = mycon.prepareStatement(q2);

                    mystate2.setString(1,"%"+jComboBox1.getSelectedItem().toString()+"%");
                    ResultSet mres = mystate2.executeQuery();

                    if(mres.next())
                    {

                        do
                        {
                            mymodel.addRow(new Object[] {mres.getString("busno"),mres.getString("route").replaceAll(",","    "),mres.getString("company"),mres.getString("type"),mres.getString("seats")});
                        }
                        while(mres.next());
                    }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in Query "+e.getMessage());

                }

                finally
                {
                    mycon.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"error in connection  "+ e.getMessage());
            }
        }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
