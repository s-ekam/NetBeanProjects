/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ekam
 */
public class Withdrawl extends HttpServlet {

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
            int apin=Integer.parseInt(getInitParameter("pin"));
            int pin = Integer.parseInt(request.getParameter("pass"));
            if(pin!=apin)
            {
                out.println("<html>\n" +
                "    <head>\n" +
                "        <title>Withdraw</title>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    </head>\n" +
                "    <body>\n" +
                "       <p><font size=\"20\"><b> Wrong Pin Try Again </b></font></p>\n" +        
                "        <form name=\"withForm\" method=\"post\" action=\"Withdrawl\">\n" +
                "            <br>Amount : <input type=\"text\" name=\"withdraw\" placeholder=\"Enter amm to withdraw\"><br><br>\n" +
                "            Pin &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : <input type=\"password\" name=\"pass\" placeholder=\"Enter Pin\"><br>\n" +
                "            <input type=\"submit\" name=\"withBut\" value=\"Withdraw\">\n" +
                "        </form>\n" +
                "    </body>\n" +
                "</html>");                
            }
            else
            {
                ServletContext cont = request.getServletContext();
                int amt=Integer.parseInt(cont.getInitParameter("amt"));
                int widh=Integer.parseInt(request.getParameter("withdraw"));
                int rem=amt-widh;
                if(rem>0)
                {
                    out.println("<html>\n" +
                    "    <head>\n" +
                    "        <title>Withdraw</title>\n" +
                    "        <meta charset=\"UTF-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <form name=\"withForm\" >\n" +
                    "            <br>Amount : <input type=\"text\" name=\"withdraw\" value=\""+widh + "\" disabled><br><br>\n" +
                    "            Pin &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  : <input type=\"password\" name=\"pass\" value=\"something\"  disabled><br>\n" +
                    "            <br><input type=\"submit\" name=\"withBut\" value=\"Withdraw\"  disabled>\n" +
                    "            <br><br>Remaning Balance = <b>"+rem+"</b>   "+
                    "        </form>\n" +
                    "    </body>\n" +
                    "</html>");
                }
                else
                {
                    out.println("<html>\n" +
                "    <head>\n" +
                "        <title>Withdraw</title>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    </head>\n" +
                "    <body>\n" +
                "       <p><font size=\"20\"><b> You are BROKE Bruh!!! </b></font></p>\n" +        
                "    </body>\n" +
                "</html>");
                }
            }
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
