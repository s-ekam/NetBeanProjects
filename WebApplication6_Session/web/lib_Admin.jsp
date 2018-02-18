<%-- 
    Document   : lib_Admin
    Created on : 21 Jun, 2017, 4:42:09 AM
    Author     : Ekam
--%>
<%
    String user=(String) session.getAttribute("user");
//    if(user==null)
//    {
//        out.println("Session Expired");
//        request.getRequestDispatcher("lib_Index.html").include(request, response);
//    }
//    else
//    {
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome <%=user%></title>
        <style type="text/css">
            body
            {
                background-image: url("");
            }
            box
            {
                border : 2px solid black;
                height : 225px;
                width : 400px;
                position: fixed ;
                top : 35%;
                left : 37%;
            }
            form{
                margin: 15px;
                margin-left: 50px;
                
            }
            
        </style>
    </head>
    <body>
        <box>

            <form method="post" action="lib_AddLibr.html">
                <input type="submit" value="Add Librarian">
            </form>
            <form method="post" action="lib_editLibr.jsp">
                <input type="submit" value="Edit Librarian">
            </form>
            <form method="post" action="lib_viewLib.jsp">
                <input type="submit" value="View Librarian">
            </form>
            <form method="post" action="lib_delLibr.jsp">
                <input type="submit" value="Delete Librarian"><br>
            </form>
            <form method="post" action="lib_Logout.jsp">
                <input type="submit" value="LOGOUT"><br>
            </form>
        </box>
    </body>
</html>
<%
//    }
%>