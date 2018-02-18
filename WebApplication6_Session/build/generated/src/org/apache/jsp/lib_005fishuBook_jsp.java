package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class lib_005fishuBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\" method=\"post\">\n");
      out.write("            ");

                String bid=request.getParameter("bid");
                String bname=request.getParameter("bname");
                if(bid==null||bid.equals(""))
                {
            
      out.write("\n");
      out.write("            Book ID:<input type=\"text\" name=\"bid\" placeholder=\"Enter Book Id to Search\"><br>\n");
      out.write("            <input type=\"submit\" value=\"GO\">\n");
      out.write("            ");

                }
                else if(bname==null){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","ekam");
                    try{
                        String q="select * from book where bid=?";
                        PreparedStatement state = con.prepareStatement(q);
                        state.setString(1,bid);
                        ResultSet rs=state.executeQuery();
                        rs.next();
                        bname=rs.getString("bname");
                        String author=rs.getString("author");
                        String totqty=rs.getString("totqty");
                        String stkqty=rs.getString("stkqty");
            
      out.write("\n");
      out.write("            Book ID:<input type=\"text\" name=\"bid\" disabled value=");
      out.print(bid);
      out.write(" ><br> <input type=\"hidden\" name=\"bid\" value=");
      out.print(bid);
      out.write(">\n");
      out.write("            Book Name&nbsp;&nbsp;&nbsp;&nbsp; : <input type=\"text\" name =\"bname\" disabled value=");
      out.print(bname);
      out.write("><input type=\"hidden\" name =\"bname\" value=");
      out.print(bname);
      out.write("><br>\n");
      out.write("            User&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type =\"text\" name=\"user\" value=");
      out.print(author);
      out.write("><br>\n");
      out.write("            Issue Date : <input type=\"date\" name=\"idate\" placeholder=\"Issue Date\"><br><br>\n");
      out.write("            Return Date &nbsp;&nbsp;: <input type=\"date\" name=\"rdate\" placeholder=\"Return Date\"><br><br>\n");
      out.write("            <input type=\"submit\" name=\"issue\" value=\"Issue Book\" style=\"margin-left: 60px\">\n");
      out.write("            <!--<input type=\"submit\" value=\"GO\">-->\n");
      out.write("            \n");
      out.write("            ");

                }
                catch(Exception e){
                    out.print(e);}
                }
                catch(Exception e){
                    out.println(e);}
                }
                
            else{
                out.println("Values Found");
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","ekam");
                    try{
                        String q="update book set bname=?,author=?,totqty=?,stkqty=? where bid=?";
                        PreparedStatement state = con.prepareStatement(q);
                        state.setString(5,bid);
                        state.setString(1,request.getParameter("bname"));
                        state.setString(2,request.getParameter("author"));
                        state.setString(3,request.getParameter("totqty"));
                        state.setString(4,request.getParameter("stkqty"));
                        if(state.executeUpdate()>0)
                            {out.println("<br>Values Updated");}
                    }
                    catch(Exception e){
                        out.print(e);}
                }
                catch(Exception e){
                    out.println(e);}
                }


            
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
