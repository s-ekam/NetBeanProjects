package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class lib_005fviewBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>All Books</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\" method=\"get\">\n");
      out.write("        ");

            int bpp=3;      //books per page
            try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","ekam");
                    try{
                        int count=0;
                        String q="Select count(*) from book";
                        PreparedStatement state=con.prepareStatement(q);
                        ResultSet rs=state.executeQuery();
                        while(rs.next())
                        {
                            count=rs.getInt(1);
                        }
////                        count=count%2;
//                        out.println(count+"<br>");
//                        out.println(bpp+"<br>");
//                        count=8;
//                        out.println("<br>"+(int)Math.ceil(((double)count)/bpp));
                        for(int i=1;i<=(int)Math.ceil(((double)count)/bpp);i++)
                        {
        
      out.write("\n");
      out.write("        <input type=\"submit\" name=\"pgno\" value=");
      out.print(i);
      out.write(">\n");
      out.write("        \n");
      out.write("        ");

                        }
//                        out.println(count);
                        q="Select * from book";
                        state = con.prepareStatement(q);
                        rs =state.executeQuery();
        
      out.write("\n");
      out.write("            <table border=\"5\" width=\"450\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Book Id</td>\n");
      out.write("                    <td>Book Name</td>\n");
      out.write("                    <td>Author</td>\n");
      out.write("                    <td>Total Quantity</td>\n");
      out.write("                    <td>In Stock</td>\n");
      out.write("                </tr>\n");
      out.write("        ");

            String pg=request.getParameter("pgno");
                  int pgno=0;
                  if(pg==null)
                  {
                      pgno=0;
                  }
                  else
                  {
                      pgno=Integer.parseInt(pg)-1;
                  }
                    for(int i=0;i<pgno*bpp;i++)
                    {
                        rs.next();
                    }
                    int c=bpp;
                        while(rs.next()&&c-->0)
                        {
                            String bid=rs.getString("bid");
                            String bname=rs.getString("bname");
                            String author=rs.getString("author");
                            String totqty=rs.getString("totqty");
                            String stkqty=rs.getString("stkqty");
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(bid);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(bname);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(author);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(totqty);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(stkqty);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("                    \n");
      out.write("        ");

                        }
                        
                    }
                    catch(Exception e){
                        out.print(e);}
                }
                catch(Exception e){
                    out.println(e);}
        
      out.write("\n");
      out.write("            </table>\n");
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
