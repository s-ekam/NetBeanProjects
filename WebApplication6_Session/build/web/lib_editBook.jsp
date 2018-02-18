
<%-- 
    Document   : lib_editBook
    Created on : 22 Jun, 2017, 5:20:23 PM
    Author     : Ekam
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Book</title>
    </head>
    <body>
        <form action="#" method="post">
            <%
                String bid=request.getParameter("bid");
                String bname=request.getParameter("bname");
                if(bid==null||bid.equals(""))
                {
            %>
            Book ID:<input type="text" name="bid" placeholder="Enter Book Id to Search"><br>
            <input type="submit" value="GO">
            <%
                }
                else if(bname==null){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","ekam");
                    try{
                        String q="select * from book where bid=?";
                        PreparedStatement state = con.prepareStatement(q);
                        state.setString(1,bid);
                        ResultSet rs=state.executeQuery();
                        rs.next();
                        bname=rs.getString("bname");
                        String author=rs.getString("author");
                        String totqty=rs.getString("totqty");
                        String stkqty=rs.getString("stkqty");
            %>
            Book ID:<input type="text" name="bid" disabled value=<%=bid%> ><br> <input type="hidden" name="bid" value=<%=bid%>>
            Book Name&nbsp;&nbsp;&nbsp;&nbsp; : <input type="text" name ="bname" value=<%=bname%>><br>
            Author&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type ="text" name="author" value=<%=author%>><br>
            Total Quantity : <input type="number" name="totqty" value=<%=totqty%>><br><br>
            Rem Quantity&nbsp;&nbsp;: <input type="number" name="stkqty" value=<%=stkqty%>><br><br>
            <input type="submit" name="edit" value="Edit Book" style="margin-left: 60px">
            <!--<input type="submit" value="GO">-->
            
            <%
                }
                catch(Exception e){
                    out.print(e);}
                }
                catch(Exception e){
                    out.println(e);}
                }
                
            else{
                out.println("Values Found");
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","ekam");
                    try{
                        String q="update book set bname=?,author=?,totqty=?,stkqty=? where bid=?";
                        PreparedStatement state = con.prepareStatement(q);
                        state.setString(5,bid);
                        state.setString(1,request.getParameter("bname"));
                        state.setString(2,request.getParameter("author"));
                        state.setString(3,request.getParameter("totqty"));
                        state.setString(4,request.getParameter("stkqty"));
                        if(state.executeUpdate()>0)
                            {out.println("<br>Values Updated");}
                    }
                    catch(Exception e){
                        out.print(e);}
                }
                catch(Exception e){
                    out.println(e);}
                }


            %>
        </form>
    </body>
</html>
