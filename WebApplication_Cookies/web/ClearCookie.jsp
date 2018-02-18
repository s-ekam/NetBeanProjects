<%-- 
    Document   : ClearCookie
    Created on : 15 Jun, 2017, 1:27:42 PM
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
        <h1>Hello World!</h1>
        <%
            
            Cookie cook[]=request.getCookies();
            for(int i=0;i<cook.length;i++)
            {
                response.addCookie(new Cookie(cook[i].getName(),null));
            }
//            cook=null;
        %>
        Cookies Deleted
    </body>
</html>
