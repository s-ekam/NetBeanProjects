/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
//import java.math.*;
import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ekam
 */
@WebServlet(urlPatterns = {"/ForgetPass2"})
public class ForgetPass2 extends HttpServlet implements conDet,EmailID{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String user = request.getParameter("user");
            String secq = request.getParameter("secq");
            String ans = request.getParameter("ans");
            String accAns="Hello";
//            out.println("<html>\n<body>");
            out.println("<b>User</b> "+user);
            out.println("<br>Ans  "+ans);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(path+place,uname,pass);
//                out.println("hlo");
                try {
                    String q="select ans from login1 where user=?";
                    PreparedStatement state = con.prepareStatement(q);
                    state.setString(1, user);
                    ResultSet rs= state.executeQuery();
                    while(rs.next())
                    {
                        accAns=rs.getString("ans");
                        out.println("<br>DB Ans: "+accAns);
                    }
                    if(accAns.equals(ans))
                    {
                        out.print("<br>Equal");
                        Properties props = new Properties();
                        props.put("mail.smtp.auth", "true");
                        props.put("mail.smtp.starttls.enable", "true");
                        props.put("mail.smtp.host", "smtp.gmail.com");
                        props.put("mail.smtp.port", "587");
                        Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() 
                        {
                            protected PasswordAuthentication getPasswordAuthentication() 
                            {
                                return new PasswordAuthentication(id, password);
                            }
                        });
                        out.println("<br>Authentication done");
                        try 
                        {
                            Message message = new MimeMessage(session);
                            message.setFrom(new InternetAddress(id));
                            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(name));
                            out.println("<br>done");
                            message.setSubject("PassWord");
                            message.setText("singh");
                            out.println("<br>done 2");
                            Transport.send(message);
                        }
                        catch(Exception e)
                        {
                            out.println("<br>Mail Error : "+e.getMessage());
                        }
                    }
                    else
                    {
                        out.println("<br>NOT Equal AccAns "+accAns);
                    }
                } 
                    catch (Exception e) {
                        out.print("<br>"+e.getMessage());
                }
            } catch (Exception e) {
                out.print("<br>"+e.getMessage());
            }
//            out.println("</body></html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
