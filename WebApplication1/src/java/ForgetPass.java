/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ekam
 */
@WebServlet(urlPatterns = {"/ForgetPass"})
public class ForgetPass extends HttpServlet implements conDet{

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
            String user= request.getParameter("user");
            String secq="";
//            String ans = request.getParameter("ans");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(path+place, uname,pass);
                try {
                    String q="select secq from login1 where user=?";
                    PreparedStatement state = con.prepareStatement(q);
                    state.setString(1,user);
                    ResultSet rs=state.executeQuery();
                    while(rs.next())
                    {
                        secq=rs.getString("secq");
                    }
                } catch (Exception e) {
                    out.println(e);
                }
                
            } catch (Exception e) {
                out.println(e);
            }
            out.println("<html>\n" +
"    <head>\n" +
"        <title>Forgot Password</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <form name =\"Form1\" method=\"post\" action=\"ForgetPass2\" >\n" +
"            Name&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:&nbsp&nbsp<input type=\"text\" name=\"user\"  value=\""+user+"\" disabled><br><br>\n" +
"            SecQues&nbsp&nbsp&nbsp&nbsp:&nbsp&nbsp<input type=\"text\" name=\"secq\" value=\""+secq+"\" disabled/><br><br>\n" +
"            Answer&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:&nbsp&nbsp<input type=\"password\" name=\"ans\" placeholder=\"Enter Answer\" />\n" +
"            <input type=\"submit\" name=\"b2\" value=\"Forget Pass\"/>\n" +
"            <input type=\"hidden\" name=\"user\"value=\""+user+"\">"+
"        </form>\n" +
"    </body>\n" +
"</html>\n" +
"");
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
