  if(jComboBox1.getSelectedIndex()>0)
        {
            Connection myconnection;
            try
            {
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                    String query="select * from citytable where statename=?";

                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, jComboBox1.getSelectedItem().toString());

                    ResultSet myresult=mystatement.executeQuery();
                    if(myresult.next())
                    {
                        jList1.clearSelection();
                        DefaultListModel mymodel=new DefaultListModel();
                        
                        do
                        {
                            mymodel.addElement(myresult.getString("cityname"));                            
                        }
                        while(myresult.next());
                        jList1.setModel(mymodel);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Query Error " + e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Connection Error " + e.getMessage());
            }
        }

========================================================
 List mycities;
 mycities=jList1.getSelectedValuesList();
       
 JOptionPane.showMessageDialog(rootPane, 
 mycities.toString().substring(1,mycities.toString().length()-1));