/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadways_project;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileFilter;
/**
 *
 * @author Ekam
 */
public class employeedetail extends javax.swing.JInternalFrame implements mycred
{

    JFileChooser fc;
    File mfil,ufile;
    Image img;
    ImageIO iamg;
    String fname="";
    
    /**
     * Creates new form newemployee
     */
    public employeedetail() {
        initComponents();
        try
        {
            mfil= new File("C:\\Users\\Ekam\\Documents\\NetBeansProjects\\Roadways_Project\\src\\Images\\default.png");
            jLabel9.setIcon(new ImageIcon(ImageIO.read(mfil).getScaledInstance(165,190,Image.SCALE_DEFAULT)));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error in constructor " + e.getMessage());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("Name");

        jLabel4.setText("Phone Number");

        jLabel5.setText("Gender");

        jLabel6.setText("Address");

        jLabel7.setText("Salary");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Female");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Male");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Update ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Post");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Post", "Receptionist", "Driver", "Conductor" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setText("Change Img");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(jTextField2))
                                .addGap(68, 68, 68)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87)
                                        .addComponent(jFormattedTextField1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton2)
                                                .addGap(105, 105, 105)
                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try
            {
            Connection mycon= DriverManager.getConnection(path+place,uname,pass);
            try
            {
                String q="select * from employeetable where username=?";
                PreparedStatement mstate= mycon.prepareStatement(q);
                mstate.setString(1,jTextField2.getText());
                
                ResultSet myresult = mstate.executeQuery();
                if(myresult.next())
                {
                    jTextField1.setText(myresult.getString("password"));
                    jTextField3.setText(myresult.getString("ename"));
                    jTextField4.setText(myresult.getString("ephone"));
                    if(myresult.getString("post").equalsIgnoreCase("receptionist"))
                    {
                        jComboBox1.setSelectedIndex(1);
                    }
                    else if(myresult.getString("post").equalsIgnoreCase("driver"))
                    {
                        jComboBox1.setSelectedIndex(2);
                    }
                    else if(myresult.getString("post").equalsIgnoreCase("condictor"))
                    {
                        jComboBox1.setSelectedIndex(3);
                    }
                    
                    if(myresult.getString("egender").equals("Male"))
                    {
                        jRadioButton2.setSelected(true);
                    }
                    if(myresult.getString("egender").equals("Female"))
                    {
                        jRadioButton1.setSelected(true);
                    }
                 
                    jTextArea1.setText(myresult.getString("eaddress"));
                    jFormattedTextField1.setText(myresult.getString("esalary"));
                    fname =myresult.getString("img");
                    ufile = new File(fname);
                    img = ImageIO.read(ufile).getScaledInstance(jLabel9.getWidth(),jLabel9.getHeight(),Image.SCALE_DEFAULT);
                    mfil = new File(fname);
                    jLabel9.setIcon(new ImageIcon(img));
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"Employee not Found");
                }

                
              
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Query"+e.getMessage());
            }
            finally
            {
                mycon.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error in connection"+e.getMessage());
        }
        
        
                                            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        
        String fname= "";
        if(mfil != null)
        {
            fname = "C:\\Users\\Ekam\\Documents\\NetBeansProjects\\Roadways_Project\\src\\Images\\"+new java.util.Date().getTime()+"_"+mfil.getName();
            int i;
            FileInputStream in= null;
            FileOutputStream out = null;
            try
            {
                in= new FileInputStream(mfil);
                out = new FileOutputStream(fname);
                byte[] b = new byte[2048];
                while((i= in.read(b))>0)
                {
                    out.write(b, 0, i);
                }
                JOptionPane.showMessageDialog(rootPane, "file Saved");
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error");
            }
            finally
            {
                try
                {
                    in.close();
                    out.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in closing flie "+ e.getMessage());
                }
            }
        }
        else
        {
            fname = "C:\\Users\\Ekam\\Documents\\NetBeansProjects\\Roadways_Project\\src\\Images\\default";
        }
        
        
            try
             {
            Connection mycon= DriverManager.getConnection(path+place,uname,pass);
            try
            {
                String q="update employeetable set password = ? , ename=? , ephone=? , egender=? , eaddress=? , esalary=?,post=?,img=? where username=?";
                PreparedStatement mstate= mycon.prepareStatement(q);
                mstate.setString(9,jTextField2.getText());
                mstate.setString(1,jTextField1.getText());
                mstate.setString(2,jTextField3.getText());
                mstate.setString(3,jTextField4.getText());
                if(jRadioButton2.isSelected())
                {
                    mstate.setString(4,"Male");
                
                }
                else if(jRadioButton1.isSelected())
                {
                    mstate.setString(4,"Female");
                }
                mstate.setString(5,jTextArea1.getText());
                mstate.setString(6,jFormattedTextField1.getText());
                mstate.setString(7,jComboBox1.getSelectedItem().toString());
                mstate.setString(8,fname);
                
                
                if(mstate.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Employee data updated Successfully");
                    employe1 obj = new employe1();
                    obj.setVisible(true);
                    this.dispose();
                    
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
            JOptionPane.showMessageDialog(rootPane,"Error in connection"+e.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int res = JOptionPane.showConfirmDialog(rootPane,"Do You Really Want to Delete","Confirm",JOptionPane.YES_NO_OPTION);
        
        if(res==JOptionPane.YES_OPTION)
        {

            try
             {
            Connection mycon= DriverManager.getConnection(path+place,uname,pass);
                try
                {
                    String q ="delete from employeetable where username = ?";
                    PreparedStatement mstate= mycon.prepareStatement(q);
                    mstate.setString(1,jTextField2.getText());
                    

                    if(mstate.executeUpdate()>0)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Employee data Deleted Successfully");
                        employe1 obj = new employe1();
                        obj.setVisible(true);
                        this.dispose();
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
                JOptionPane.showMessageDialog(rootPane,"Error in connection"+e.getMessage());
            }
            
        }



    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        fc = new JFileChooser();
//        fc.setSize(100,100);
        fc.setFileFilter(new FileFilter() {
            
            @Override
            public boolean accept(File f) 
            {
                if(f.isDirectory())
                {
                    return true;
                }
                int pos = f.getName().lastIndexOf('.');
                
                if(pos==-1)
                {
                    return false;
                }
                else
                {
                    String ext = f.getName().substring(pos+1);
                    String str[] = {"gif","png","jpg","jpeg"};
                    for(String all : str)
                    {
                        if(ext.equalsIgnoreCase(all))
                        {
                            return true;
                        }
                    }
                    return false;
                }
            }

            @Override
            public String getDescription() {
                return "gif,png,jpg,jpeg";
                
            }
        });
        
        int res = fc.showOpenDialog(null);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                
                mfil = fc.getSelectedFile();
                Image  smig = ImageIO.read(mfil).getScaledInstance(jLabel9.getWidth(),jLabel9.getHeight(),Image.SCALE_DEFAULT);
                jLabel9.setIcon(new ImageIcon(smig));
                fname= mfil.getName();
                System.out.println(fname);
            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error adding Image "+ e.getMessage() );
                
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
