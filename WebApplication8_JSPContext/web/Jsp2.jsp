<%-- 
    Document   : Jsp2
    Created on : 29 Jun, 2017, 2:14:11 PM
    Author     : Ekam
--%>
<%
    String user=request.getParameter("user");
    String pass=request.getParameter("pass");
    String cuser=application.getInitParameter("user");
    String cpass=config.getInitParameter("pass");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if(user.equals(cuser)&&pass.equals(cpass))
        {
            out.print("Welcome "+user);
        }
        else
        {
            out.print("Wrong User/Password<br>");
            out.print(cuser+"<br>");
            out.print(cpass);
            
        }
        %>
    </body>
</html>
