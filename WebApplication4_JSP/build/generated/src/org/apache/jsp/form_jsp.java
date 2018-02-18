package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String user=request.getParameter("user");
    String pass=request.getParameter("pass");
    String phn=request.getParameter("phn");
//    out.println(user+"\n"+pass+"<br>");
    String phUser="Enter_UserName";
    String phPass="Enter_Password";
    String phPhone="Enter_Phone_No";
    ArrayList ar=new ArrayList();
    if(user==null)
    {}
    else if(user.equals(""))
    {
        ar.add("user");
        phUser="FILL_THIS_FORM";
    }
    if(pass==null)
    {}
    else if(pass.equals(""))
    {
        ar.add("Password");
        phPass="FILL_THE_PASSWORD";
    }
    if(phn==null)
    {}
    else if(phn.equals(""))
    {
        ar.add("Phone");
        phPhone="FILL_THE_Phone";
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"#\">\n");
      out.write("            User :  ");

                        if(user==null || user.equals(""))
                        {
                            out.print("<input type='text' name='user'  placeholder="+phUser+"><br>");
                        }
                        else if(!user.equals(""))
                        {
                            out.print("<input type='text' name='user'  value="+user+"><br>");
                        }
                    
      out.write("\n");
      out.write("            Pass : ");

                        if(pass==null||pass.equals(""))
                        {
                            out.print("<input type='text' name='pass'  placeholder="+phPass+"><br>");
                        }
                        else if(!pass.equals(""))
                        {
                            out.print("<input type='text' name='pass'  value="+pass+"><br>");
                        }
                    
      out.write("\n");
      out.write("            Phone : ");

                        if(phn==null||phn.equals(""))
                        {
                            out.print("<input type='text' name='phn'  placeholder="+phPhone+"><br>");
                        }
                        else if(!phn.equals(""))
                        {
                            out.print("<input type='text' name='phn'  value="+phn+"><br>");
                        }
                    
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"b1\" value=\"Add\">\n");
      out.write("        </form>\n");
      out.write("            <p>\n");
      out.write("                <font color=\"red\"> <b>\n");
      out.write("                    <ol type=\"I\">\n");
      out.write("                ");

                    if(!ar.isEmpty())
                    {
                        for(int i=0;i<ar.size();i++)
                            out.print("<li>"+ar.get(i)+"</li><br>");
                    }
                
      out.write("\n");
      out.write("                    </ol>\n");
      out.write("                </b><font>\n");
      out.write("            </p>\n");
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
