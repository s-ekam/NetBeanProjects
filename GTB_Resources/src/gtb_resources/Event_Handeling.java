package gtb_resources;

import java.awt.event.*;
import javax.swing.*;
class Event_Handel extends JFrame implements ActionListener, ItemListener
{
    JRadioButton cb1,cb2;
    JLabel lb1,lb2,lb3;
    JTextField t1;
    JComboBox dept;
    JButton btn1;
    ButtonGroup gender;
    Event_Handel()
    {
        this.setSize(800,600);
        this.setLayout(null);
       this.setTitle("AWT Example");
       
       dept=new JComboBox();
       dept.addItem("Choose department");
       dept.addItem("Purchase");
       dept.addItem("Sales");

        lb1=new JLabel("Enter your salary");
        lb2=new JLabel("Choose gender");
        lb3=new JLabel("0");
         t1=new JTextField(10);
       cb1=new JRadioButton("Male");
        cb2=new JRadioButton("Female");
         gender=new ButtonGroup();
         gender.add(cb1);
         gender.add(cb2);
        
        btn1=new JButton("Calculate Bonus");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btn1.addActionListener(this);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        
          
        lb1.setBounds(50, 50, 130, 25); 
        t1.setBounds(180, 50, 130, 25); 
        lb2.setBounds(50, 100, 100, 25); 
        cb1.setBounds(180, 100, 100, 25); 
        cb2.setBounds(180, 150, 100, 25); 
        dept.setBounds(180, 200, 150, 25);
        btn1.setBounds(180, 250, 150, 25);          
         lb3.setBounds(180, 300, 100, 25); 
        add(btn1);add(t1);add(dept);
       add(lb1);add(lb2);add(cb1);add(cb2);add(lb3);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String dept1=dept.getSelectedItem().toString();
        
        if(!t1.getText().equals(""))
        {
        int a=Integer.parseInt(t1.getText());
        
       int bonus;
       if(cb1.isSelected() && dept1.equals("Purchase"))
       {
           bonus=(50*a)/100;
           lb3.setText(String.valueOf(bonus));
       }
       else if(cb1.isSelected() && dept1.equals("Sales"))
       {
           bonus=(60*a)/100;
           lb3.setText(String.valueOf(bonus));
       }
       else if(cb2.isSelected() && dept1.equals("Purchase"))
       {
           bonus=(55*a)/100;
           lb3.setText(String.valueOf(bonus));
       }
       else if(cb2.isSelected() && dept1.equals("Sales"))
       {
           bonus=(65*a)/100;
           lb3.setText(String.valueOf(bonus));
       }
       else
       {
           lb3.setText("Fill All Values first");
       }
        }
        else
       {
           lb3.setText("Fill All Values first");
       }
        
    }
    public void itemStateChanged(ItemEvent ie)
    {
      
        
    }
}
public class Event_Handeling 
{
    public static void main(String[] args) 
    {
        Event_Handel obj = new Event_Handel();
        obj.setVisible(true);
    }

}