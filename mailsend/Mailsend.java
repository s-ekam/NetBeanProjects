/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mailsend;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.Transport;
import javax.swing.JPasswordField;



public class Mailsend implements ActionListener{
Frame f = new Frame("Send your Mail");
Label l = new Label("To");
Label l1 = new Label("From");
Label l2=new Label("Password");
TextField tf = new TextField(10);
TextField tf1 = new TextField(10);
JPasswordField tf2 = new JPasswordField(10);

Button b = new Button("Mail");

    public Mailsend() throws AddressException, MessagingException {
       
        f.setBackground(Color.WHITE);
        
        f.add(l);
        f.add(tf);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(b);
        f.setSize(500, 500);
        f.setVisible(true);
   
        f.setLayout(null);
    
        l.setBounds(50, 40, 50, 20);
        
        l1.setBounds(50, 70, 50, 20);
        
        l2.setBounds(50, 110, 70, 20);
        
        tf.setBounds(120, 40, 130, 20);
        tf1.setBounds(120, 70, 130, 20);
        tf2.setBounds(120, 110, 130, 20);
        
        b.setBounds(130, 140, 50, 40);
        
        
        
    b.addActionListener(this);
   
    }
   
    public static void main(String[] args) throws AddressException, MessagingException 
    {
     
        new Mailsend();
           
}

    @Override
    public void actionPerformed(ActionEvent e) 
    {
    
  final String name =  tf.getText();
   final  String id = tf1.getText();
   final  String password = tf2.getText();
    
    		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
                
		Session session = Session.getInstance(props,
		  new Authenticator() 
                  
                  {
			protected PasswordAuthentication getPasswordAuthentication() 
                        
                        {
				return new PasswordAuthentication(id, password);
                                
			}
		  });
 System.out.println("Authentication done");
		try {
 
			Message message = new MimeMessage(session);
                      
			message.setFrom(new InternetAddress(id));
                    
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(name));
                             System.out.println("done");
			message.setSubject("Testing Subject");
			message.setText("Dear check my email, please!");
                        
  System.out.println("done");
			Transport.send(message);
 
			
 JOptionPane.showMessageDialog(null, "Mail Send");
		} catch (MessagingException ee) {
			throw new RuntimeException(ee);
		}
	}
}