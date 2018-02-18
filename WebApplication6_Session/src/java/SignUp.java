/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ekam
 */
public class SignUp extends HttpServlet {

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
            String user=request.getParameter("user");
            String pass=request.getParameter("pass");
            Cookie ck[]=request.getCookies();
            String cuser = null;
            String cpass = null;
            for(int i=0;i<ck.length;i++)
            {
                if(ck[i].getName().equals("user"))
                {
                    cuser=ck[i].getValue();
//                    break;
                }
                if(ck[i].getName().equals("pass"))
                {
                    cpass=ck[i].getValue();
                }
            }
            if(cuser==null||cuser.equals(""))
            {
                cuser=user;
            }
            else if(cuser.contains(user))
            {
                out.print("UserName Already Taken<br><Br>");
                RequestDispatcher rd= request.getRequestDispatcher("signUp.html");
                rd.include(request, response);                
                return;
            }
            else
            {
                cuser=cuser+","+user;
            }
            if(cpass==null||cpass.equals(""))
            {
                cpass=pass;
            }
            else
            {
                cpass=cpass+","+pass;
            }
            response.addCookie(new Cookie("user",cuser));
            response.addCookie(new Cookie("pass",cpass));
            out.println("New User Added<br>");
            RequestDispatcher rd= request.getRequestDispatcher("ShowCookie2.jsp");
            rd.include(request, response);
            out.print("<br><a href=\"ShowCookie2.jsp\">Show Cookies</a><br>");
            
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
