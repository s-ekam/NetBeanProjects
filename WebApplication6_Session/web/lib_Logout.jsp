<%-- 
    Document   : lib_Logout
    Created on : 21 Jun, 2017, 7:03:16 AM
    Author     : Ekam
--%>
<%
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout </title>
    </head>
    <body>
        Logged OUT!!!
        <%
//            request.getRequestDispatcher("lib_Index.html").include(request, response);
            session.invalidate();
            request.getRequestDispatcher("lib_Index.html").forward(request, response);
//            session.wait(5);
//            response.sendRedirect("lib_Index.html");
        %>
    </body>
</html>
