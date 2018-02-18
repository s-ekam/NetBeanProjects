<%-- 
    Document   : ShowCookie
    Created on : 14 Jun, 2017, 3:16:56 PM
    Author     : Ekam
--%>

<%
    Cookie ck[]=request.getCookies();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Cookie</title>
    </head>
    <body>
        <ol>
            <%
                
                for(int i=0;i<ck.length;i++)
                {
                    if(ck[i].getValue().length()==0)
                    {
                        continue;
                    }
                    out.println("<li>"+ck[i].getValue()+"</li>");
                }
            %>
        </ol>
        <a href="add.html">ADD Cookies</a><br>
        <a href="ShowCookie.jsp">SHOW Cookies</a><br>
        <a href="ClearCookie.jsp">Clear Cookies</a><br> 
    </body>
</html>
