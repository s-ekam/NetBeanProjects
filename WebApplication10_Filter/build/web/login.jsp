<%-- 
    Document   : login
    Created on : 3 Jul, 2017, 2:38:09 PM
    Author     : Ekam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login" method="post">
            User:<input type="text" name="user"><br>
            Pass:<input type="text" name="pass"><br>
            <input type="Submit" name="GO"><br>
        </form>
        <%
            Object error = request.getAttribute("error");
            if(error!=null&&error.toString().equalsIgnoreCase("true"))
            {
                out.println("Fill Spaces<BR>"+error);
            }
        %>
    </body>
</html>
