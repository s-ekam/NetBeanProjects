<%-- 
    Document   : browse
    Created on : Jun 23, 2017, 10:59:55 PM
    Author     : user
--%>

<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.FileInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <title>browse</title>
    </head>
    <body>
        <form name="f1" method="post"   enctype="multipart/form-data" >
            <input type="file" name="b1" value="browse"><br>
            <input type="submit" name="b2" value="write"><br><br>
        </form>
        <% 
             String s2="";
            
              
       try
        {
            MultipartRequest m = new MultipartRequest(request, "D:\\upload\\");
           File l=new File("D:\\upload\\");
           String s[]=l.list();

            FileInputStream f1=new FileInputStream("D:\\upload\\"+s[0]);
            int x=0;
           
            while((x=f1.read())!=-1)
            {
                s2=s2+((char)x);
            }
           File l1=new File("D:\\upload\\"+s[0]);  
         f1.close();
         l1.delete();
         out.println("deleted");
        }
        catch(Exception e)
        {
            out.println(e);
        }
        
        
      //  s2="dgdgdggdg";
        
        %>
          <form  method="post" >
              <textarea rows="8" cols="70">
                <% out.println(s2);
                s2=null;%>
              </textarea>
        </form>
    </body>
</html>
