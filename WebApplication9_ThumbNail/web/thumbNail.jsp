<%-- 
    Document   : thumbNail
    Created on : 1 Jul, 2017, 2:28:34 PM
    Author     : Ekam
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.File"%>
<%
//    File f= new File("");
//    String str[]=f.list();
//    for(String s:str)
//    {
//        out.println(s+"<br>");
//    }
    String path= application.getRealPath("thumbNail.jsp");
    path=path.substring(0,path.lastIndexOf("\\")+1);
    out.print(path+"<br>");
    File f=new File(path);
    String str[] =f.list();
    ArrayList<String> ar=new ArrayList();
    for(String s:str)
    {
        out.print(s+"<br>");
        if(s.contains(".jpg"))
        {
            ar.add(s);
        }
    }
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ThumbNails </title>
    </head>
    <body>
        <%
            for(String a:ar)
            {
        %>
        <img src="<%=path+a%>" alt="NOT FOUND">
        <%
            }
        %>
    </body>
</html>
