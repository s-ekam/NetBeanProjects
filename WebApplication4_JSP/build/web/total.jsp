<%-- 
    Document   : total
    Created on : 13 Jun, 2017, 3:15:07 PM
    Author     : Ekam
--%>
<%
    int num1=Integer.parseInt(request.getParameter("num1"));
    int num2=Integer.parseInt(request.getParameter("num2"));
    int num3=num1+num2;

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SUM</title>
    </head>
    <body>
        <input type="TEXT" value=<%=num3%>>
    </body>
</html>
