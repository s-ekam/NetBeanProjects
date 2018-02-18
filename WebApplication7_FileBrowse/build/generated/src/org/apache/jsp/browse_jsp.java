package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.util.Enumeration;
import com.oreilly.servlet.MultipartRequest;
import java.io.FileInputStream;

public final class browse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        <title>browse</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"f1\" method=\"post\"   enctype=\"multipart/form-data\" >\n");
      out.write("            <input type=\"file\" name=\"b1\" value=\"browse\"><br>\n");
      out.write("            <input type=\"submit\" name=\"b2\" value=\"write\"><br><br>\n");
      out.write("        </form>\n");
      out.write("        ");
 
             String s2="";
            
             int count=0; 
             String str2="";
             int ch=0,uc=0,lc=0,in=0,oth=0;
            
       try
        {
            String path="F:\\Upload\\";
            MultipartRequest m = new MultipartRequest(request, path);
           File l=new File(path);
           String s[]=l.list();

            FileInputStream fis=new FileInputStream(path+s[0]);
            DataInputStream dis=new DataInputStream(fis);
            BufferedReader br=new BufferedReader(new InputStreamReader(dis));
            String str="";
            count=0;
           
            while((str=br.readLine())!=null)
            {
                str2=str2+"\n"+str;
                count++;
                for(int i=0;i<str.length();i++)
                {
                    Character chx=str.charAt(i);
                    if(Character.isAlphabetic(chx))
                    {
                        ch++;
                        if(Character.isUpperCase(chx))
                        {
                            uc++;
                        }
                        else if(Character.isLowerCase(chx))
                        {
                            lc++;
                        }
                    }
                    else if(Character.isDigit(chx))
                    {
                        in++;
                    }
                    else
                    {
                        oth++;
                    }
                }
            }
           File l1=new File("D:\\Upload\\"+s[0]);  
         fis.close();
         l1.delete();
         out.println("deleted");
        }
        catch(Exception e)
        {
            out.println(e);
        }
        
        
      //  s2="dgdgdggdg";
        
        
      out.write("\n");
      out.write("          <form  method=\"post\" >\n");
      out.write("              <textarea cols=\"150\"rows=");
      out.print(count);
      out.write(">\n");
      out.write("                ");
 out.println(str2);
//                s2=null;
                
      out.write("\n");
      out.write("              </textarea>\n");
      out.write("        </form>\n");
      out.write("              <br><br>\n");
      out.write("                Int = ");
      out.print(in);
      out.write("<br>\n");
      out.write("                Char= ");
      out.print(ch);
      out.write("<br>\n");
      out.write("                Uper= ");
      out.print(uc);
      out.write("<br>\n");
      out.write("                Lowr= ");
      out.print(lc);
      out.write("<br>\n");
      out.write("                Oth = ");
      out.print(oth);
      out.write("<br>\n");
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
