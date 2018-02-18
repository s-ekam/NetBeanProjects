<%-- 
    Document   : Logout
    Created on : 15 Jun, 2017, 2:48:53 PM
    Author     : Ekam
--%>
<%
    session.invalidate();
    out.println("LOGGED OUT <BR><BR>");
    request.getRequestDispatcher("index2.html").forward(request, response);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logged Out</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
