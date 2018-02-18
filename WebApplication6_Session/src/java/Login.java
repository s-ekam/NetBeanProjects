/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ekam
 */
public class Login extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String user=request.getParameter("user");
            String pass=request.getParameter("pass");
            Cookie ck[]=request.getCookies();
            String cuser[] = null;                     //All Users
            String cpass[] = null;                     //All Passwords
            for(int i=0;i<ck.length;i++)
            {
                if(ck[i].getName().equals("user"))
                {
                    cuser=ck[i].getValue().split(",");
                }
                if(ck[i].getName().equals("pass"))
                {
                    cpass=ck[i].getValue().split(",");
                }
            }
            boolean flag=true;
            for(int i=0;i<cuser.length;i++)
            {
                if(cuser[i].equals(user))
                {
                    if(cpass[i].equals(pass))
                    {
                        flag=false;
                        out.println("Logged In");
                        HttpSession hs=request.getSession();
                        hs.setAttribute("cuser",user);
                        response.sendRedirect("Profile.jsp");
                        return;
                    }
                }
            }
            if(flag)
            {
                out.println("Incorrect UserName / Password<br>");
                request.getRequestDispatcher("login.html").include(request, response);
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
