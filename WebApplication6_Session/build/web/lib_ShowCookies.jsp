<%-- 
    Document   : lib_ShowCookies
    Created on : 21 Jun, 2017, 4:11:03 AM
    Author     : Ekam
--%>
<%
    Cookie ck[]=request.getCookies();
    String adminu=null;
    String adminp=null;
    String libru=null;
    String librp=null;
    for(Cookie ck1:ck)
    {
        if(ck1.getName().equalsIgnoreCase("adminu"))
        {
            adminu=ck1.getValue();
        }
        if(ck1.getName().equalsIgnoreCase("adminp"))
        {
            adminp=ck1.getValue();
        }
        if(ck1.getName().equalsIgnoreCase("libru"))
        {
            libru=ck1.getValue();
        }
        if(ck1.getName().equalsIgnoreCase("librp"))
        {
            librp=ck1.getValue();
        }
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ALL Users</title>
    </head>
    <body>
        Admin User: <%=adminu%><br>
        Admin pass: <%=adminp%><br><br>
        Libr  User: <%=libru%><br>
        Libr  pass: <%=librp%>
        
    </body>
</html>
