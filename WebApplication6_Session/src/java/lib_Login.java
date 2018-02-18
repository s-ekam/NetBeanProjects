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
public class lib_Login extends HttpServlet {

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
            String but=request.getParameter("but");
            if(but.equalsIgnoreCase("Sign UP"))
            {
                response.sendRedirect("lib_SignUp.html");
            }
            else if(but.equalsIgnoreCase("login"))
            {
                String user=request.getParameter("user");
                String pass=request.getParameter("pass"); 
                Cookie ck[]=request.getCookies();
                String cuser = null;
                String cpass = null;
                String lType=request.getParameter("radiobut");
                if(lType==null)
                {
                    response.sendRedirect("lib_Index.html");
                    return;
                }
//                if(lType.equalsIgnoreCase("admin"))
//                {
//                    for (Cookie ck1 : ck) {
//                        if (ck1.getName().equals("admin")) {
//                            cuser = ck1.getValue();
//                        }
//                        if (ck1.getName().equals("apass")) {
//                            cpass = ck1.getValue();
//                        }
//                    }
//                    String allUser[]=cuser.split(",");
//                    String allPass[]=cpass.split(",");
//                    for(int i=0;i<allUser.length;i++)
//                    {
//                        if(allUser[i].equals(user)&&allPass[i].equals(pass))
//                        {
//                            response.sendRedirect("");
//                        }
//                    }
//                    
//                }
//                else if(lType.equalsIgnoreCase("libr"))
//                {
//                    
                    for (Cookie ck1 : ck) {
                        if (ck1.getName().equals(lType+"u")) {
                            cuser = ck1.getValue();
                        }
                        if (ck1.getName().equals(lType+"p")) {
                            cpass = ck1.getValue();
                        }
                    }
                    boolean corect=false;
                    String allUser[]=cuser.split(",");
                    String allPass[]=cpass.split(",");
                    for(int i=0;i<allUser.length;i++)
                    {
                        if(allUser[i].equals(user)&&allPass[i].equals(pass))
                        {
                            corect=true;
                            HttpSession hs=request.getSession();
                            hs.setAttribute("user",user);
                            hs.setAttribute("type",lType);
                            response.sendRedirect("lib_"+lType+".jsp");
                        }
                    }
                    if(!corect)
                    {
                        out.println("Invalid Username/Password");
                        request.getRequestDispatcher("lib_Index.html").include(request, response);
                    }
//                }
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
