
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ekam
 */
public class Email implements EmailDet{
//    String emailid ;
//    
//    Email(String id)
//    {
//        emailid = id;
//    }
    
    static void sendEmail(String email, String attch,int reqId)
    {
        String fileName = attch.substring(attch.lastIndexOf("\\"));
        Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
                
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() 
                  
                  {
//                        @Override
			protected PasswordAuthentication getPasswordAuthentication() 
                        
                        {
				return new PasswordAuthentication(id, pass);
                                
			}
		  });
 System.out.println("Authentication done");
		try {
 
			Message message = new MimeMessage(session);
                       
			
			message.setFrom(new InternetAddress(id));
                    
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
            System.out.println("done");
			message.setSubject("Regression Analysis Result");
//                        message.setContent();
                        BodyPart msgBody = new MimeBodyPart();
                        msgBody.setText("The result for your Request ID:"+reqId+"\n"+attch);
                        Multipart ms = new MimeMultipart();
                        ms.addBodyPart(msgBody);
                        msgBody  = new MimeBodyPart();
                        DataSource ds = new FileDataSource(attch);
                        msgBody.setDataHandler(new DataHandler(ds));
                        msgBody.setFileName(reqId+fileName);
                        ms.addBodyPart(msgBody);
                        
                        message.setContent(ms);
                        
            System.out.println("done");
			Transport.send(message);
            System.out.println("SENT");
			
// JOptionPane.showMessageDialog(null, "Mail Send");
		} catch (Exception ee) {
                    System.out.println(ee.getMessage());
			throw new RuntimeException(ee);
		}
                
                
        
    }
//    
//    void copy()
//    {
//        String path = "C:\\Users\\Ekam\\Desktop\\03 - Practical Session on R\\Project";
//        String mod = path+"\\Models\\randomForest-Model.RData";
//            int id=1;
//            String dir = path+"\\"+id;
//            try{
//                
//                    FileInputStream fis = new FileInputStream(mod);
////                    DataInputStream dis = new DataInputStream(fis);
////                    BufferedReader br = new BufferedReader(new InputStreamReader(dis));
////                    
//                    FileOutputStream fos = new FileOutputStream(dir+"\\randomForest-Model.RData");
////                    DataOutputStream dos = new DataOutputStream(fos);
////                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(dos));
//////                    FileWriter fw = new FileWriter(dir+"\\randomForest-Model.RData");
//                    int c;
//                    while((c=fis.read())!=-1)
//                    {
//                        fos.write(c);
//                    }
////                    String s ;
////                    while((s=br.readLine())!=null)
////                    {
////                        bw.append(s+"\n");
//////                        fw.write(s);
////                    }
//                    fis.close();
////                    bw.close();
//                    fos.close();
//                }
//                catch(Exception e)
//                {
//                    System.out.println(e.getMessage());
//                    return;
//                }
//    }
//    
}
