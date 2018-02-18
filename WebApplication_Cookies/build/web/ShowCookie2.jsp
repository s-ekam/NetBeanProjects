<%-- 
    Document   : ShowCookie2
    Created on : 15 Jun, 2017, 2:04:02 PM
    Author     : Ekam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Cookies</title>
    </head>
    <body>
         <%
                Cookie ck[]=request.getCookies();
                for(int i=0;i<ck.length;i++)
                {
                    if(ck[i].getName().equals("user")||ck[i].getName().equals("pass"))
                    {
                        if(!ck[i].getValue().equals(""))
                         out.println("<li>"+ck[i].getValue()+"</li>");
                        else
                        {
                            out.println("No Cookies<br>");
                            break;
                        }
                    }
                }
            %>
    </body>
</html>
