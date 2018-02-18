<%-- 
    Document   : browse
    Created on : 28 Jun, 2017, 1:32:54 PM
    Author     : Ekam
--%>

<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.DataInputStream"%>
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
           File l1=new File(path+s[0]);  
         fis.close();
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
              <textarea rows=<%=count%>"" cols="150" >
                <% out.println(str2);
//                s2=null;
                %>
              </textarea>
        </form>
              <br><br>
                Int = <%=in%><br>
                Char= <%=ch%><br>
                Uper= <%=uc%><br>
                Lowr= <%=lc%><br>
                Oth = <%=oth%><br>
                <%
                    
                %>
    </body>
</html>
