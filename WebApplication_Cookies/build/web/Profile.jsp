<%-- 
    Document   : Profile
    Created on : 15 Jun, 2017, 2:39:38 PM
    Author     : Ekam
--%>

<%
    String cuser=" ";
    Cookie ck[]=request.getCookies();
    boolean b=false;
    int j=0;
    //response.setHeader("Refresh", "1");
    for(int i=0;i<ck.length;i++)
    {
        if(ck[i].getName().equals("cuser"))
        {
            j=i;
//            out.println("hlo"+ck[i].getValue()+"hi"+ck[i].getName());
            if(ck[i].getValue().equals("")||ck[i].getValue()==null)
            {
                b=true;
                break;
                
            }
        }
    }
    if(b)
    {
    out.println("Login First");
                request.getRequestDispatcher("login.html").include(request, response);
                return;
    }
    
    
            else
            {
                out.print(j);
                cuser=ck[j].getValue().toUpperCase()    ;
            }
     
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <h1>Welcome<%=cuser%></h1>
    </body>
</html>
