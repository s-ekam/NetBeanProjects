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

/**
 *
 * @author Ekam
 */
public class lib_SignUp extends HttpServlet {

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
            out.println("HERE ");
            String lType=request.getParameter("radiobut");
            out.println(lType);
            String user=request.getParameter("user");
            String pass=request.getParameter("pass");
            
            String cuser=null;
            String cpass=null;
            Cookie ck[] = request.getCookies();
//            out.print(user+"  "+pass);
//            out.println("  len"+ck+"adr");
            if(ck!=null)
            {
                for(Cookie ck1:ck)
                {
//                    out.print(user+"  "+pass);
                    if(ck1.getName().equals(lType+"u"))
                    {
                        cuser=ck1.getValue();
                    }
                    if(ck1.getName().equals(lType+"p"))
                    {
                        cpass=ck1.getValue();
                    }
                }
                
            }
//            out.print(user+"  "+pass);
            if(cuser==null||cuser.equals(""))
            {
                cuser=user;
                cpass=pass;
            }
            else
            {
                String alluser[]=cuser.split(",");
                String allpass[]=cpass.split(",");
    //            boolean present=false;
                for(int i=0;i<alluser.length;i++)
                {
                    if(alluser[i].equals(user))
                    {
                        out.print("USERNAME ALREADY TAKEN");
                        request.getRequestDispatcher("lib_SignUp.html").include(request, response);
                        return;
                    }
                }
                cuser=cuser+","+user;
                cpass=cpass+","+pass;
                out.print(cuser+"\n  "+cpass);
            }
            response.addCookie(new Cookie(lType+"u", cuser));
            response.addCookie(new Cookie(lType+"p", cpass));
            out.print("<br><br><a href=\"lib_ShowCookies.jsp\">SHOW All</a>");
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
