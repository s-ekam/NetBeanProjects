<%-- 
    Document   : lib_ishuBook
    Created on : 27 Jun, 2017, 12:28:09 AM
    Author     : Ekam
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            Book Name&nbsp;&nbsp;&nbsp;&nbsp; : <input type="text" name ="bname" disabled value=<%=bname%>><input type="hidden" name ="bname" value=<%=bname%>><br>
            User&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : <input type ="text" name="user" placeholder="Enter User's Name"><br>
            Issue Date : <input type="date" name="idate" placeholder="Issue Date"><br>
            Return Date &nbsp;&nbsp;: <input type="date" name="rdate" placeholder="Return Date"><br><br>
            <input type="submit" name="issue" value="Issue Book" style="margin-left: 60px">
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
                        String q="insert into ishubook values(?,?,?,?,0)";
                        PreparedStatement state = con.prepareStatement(q);
                        state.setString(1,bid);
//                        state.setString(2,request.getParameter("bname"));
                        state.setString(2,request.getParameter("user"));
                        state.setString(3,request.getParameter("idate"));
                        state.setString(4,request.getParameter("rdate"));
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
