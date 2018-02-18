/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ekam
 */
public class drinks extends HttpServlet {

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
            String drink= request.getParameter("colour");
            if(drink.equals("Select 1 Drink Colour"))
            {
                out.println("<html>\n" +
            "    <head>\n" +
            "        <title>Drinks</title>\n" +
            "        <meta charset=\"UTF-8\">\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "        <style>\n" +
            "            body{\n" +
            "                background-image: url(drinks.jpeg) ;\n" +
            "                /*background-attachment: fixed ;*/\n" +
            "                background-repeat: no-repeat;\n" +
            "                background-size: cover;\n" +
            "                \n" +
            "            }\n" +
            "        </style>\n" +
            "    </head>\n" +
            "    <body>\n" +
            "        <p><font size=\"20\">Drink Select KRO!!!!</font></p>"+
            "        <form method=\"POST\" action=\"\">\n" +
            "            <select name=\"colour\">\n" +
            "                <option>Select 1 Drink Colour</option>\n" +
            "                <option>Black</option>\n" +
            "                <option>Green</option>\n" +
            "                <option>Red</option>\n" +
            "                <option>Orange</option>\n" +
            "                <option>Clear</option>\n" +
            "            </select>\n" +
            "            <input type=\"submit\" name=\"b1\" value=\"GO\">\n" +
            "        </form>\n" +
            "    </body>\n" +
            "</html>\n" +
            "");
            }
            else
            {
                ArrayList ar=DrinksData.drinkName(drink);
                out.println("<html>\n" +
            "    <head>\n" +
            "        <title>Drinks</title>\n" +
            "        <meta charset=\"UTF-8\">\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "        <style>\n" +
            "            body{\n" +
            "                background-image: url(drinks.jpeg) ;\n" +
            "                /*background-attachment: fixed ;*/\n" +
            "                background-repeat: no-repeat;\n" +
            "                background-size: cover;\n" +
            "                \n" +
            "            }\n" +
            "        </style>\n" +
            "    </head>\n" +
            "    <body>\n" +
            "        <form method=\"POST\" action=\"\">\n" +
            "            <select name=\"colour\" >\n" +
            "                <option>Select 1 Drink Colour</option>\n" +
            "                <option>Black</option>\n" +
            "                <option>Green</option>\n" +
            "                <option>Red</option>\n" +
            "                <option>Orange</option>\n" +
            "                <option>Clear</option>\n" +
            "            </select>\n" +
            "            <input type=\"submit\" name=\"b1\" value=\"GO\" >\n" +
            "        </form>\n" );
                for(int i=0;i<ar.size();i++)
                {
                    out.print(ar.get(i)+"<br>");
                }
                out.print(
            "    </body>\n" +
            "</html>\n" +
            "");
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
