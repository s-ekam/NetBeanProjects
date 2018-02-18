<%-- 
    Document   : lib_Libr
    Created on : 21 Jun, 2017, 3:08:05 PM
    Author     : Ekam
--%>
<%
HttpSession hs=request.getSession();
String user;
        try{
            user=hs.getAttribute("user").toString();
        }//.toUpperCase();
        catch(Exception e)
        {
            user="AdminRocks";
        }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome <%=user%></title>
    </head>
    <body>
        <form method="post" action="lib_addBook.html">
            <input type="submit" value="Add Book"><br>
        </form>
        <form method="post" action="lib_editBook.jsp">
            <input type="submit" value="Edit Book"><br>
        </form>
        <form method="post" action="lib_viewBook.jsp">
            <input type="submit" value="View All Books"><br>
        </form>
        <form method="post" action="lib_ishuBook.jsp">
            <input type="submit" value="Issue Books"><br>
        </form>
<!--        <form method="post" action="lib_delBook.jsp">
            <input type="submit" value="Delete Librarian"><br><br>
        </form>-->
        <form method="post" action="lib_Logout.jsp">
            <input type="submit" value="LOGOUT"><br>
        </form>
    </body>
</html>
