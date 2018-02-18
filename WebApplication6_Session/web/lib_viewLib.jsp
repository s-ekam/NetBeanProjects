<%-- 
    Document   : lib_viewLib
    Created on : 21 Jun, 2017, 6:52:49 AM
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
        <%
            Cookie ck[]=request.getCookies();
            String cuser=null,cpass=null;
            for(Cookie ck1:ck)
            {
                if(ck1.getName().equalsIgnoreCase("libru"))
                {
                    cuser=ck1.getValue();
                }
                if(ck1.getName().equalsIgnoreCase("librp"))
                {
                    cpass=ck1.getValue();
                }
            }
            String alluser[]=cuser.split(",");
            String allpass[]=cpass.split(",");
            out.println("User_____pass<br><br>");
            for(int i=0;i<alluser.length;i++)
            {
                out.println(alluser[i]+"______" +allpass[i]+"<br>");
            }
        %>
    </body>
</html>
