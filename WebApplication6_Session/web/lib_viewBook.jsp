<%-- 
    Document   : lib_viewBook
    Created on : 22 Jun, 2017, 5:42:22 PM
    Author     : Ekam
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Books</title>
    </head>
    <body>
        <form action="#" method="get">
        <%
            int bpp=3;      //books per page
            try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","ekam");
                    try{
                        int count=0;
                        String q="Select count(*) from book";
                        PreparedStatement state=con.prepareStatement(q);
                        ResultSet rs=state.executeQuery();
                        while(rs.next())
                        {
                            count=rs.getInt(1);
                        }
////                        count=count%2;
//                        out.println(count+"<br>");
//                        out.println(bpp+"<br>");
//                        count=8;
//                        out.println("<br>"+(int)Math.ceil(((double)count)/bpp));
                        for(int i=1;i<=(int)Math.ceil(((double)count)/bpp);i++)
                        {
        %>
        <input type="submit" name="pgno" value=<%=i%>>
        
        <%
                        }
//                        out.println(count);
                        q="Select * from book";
                        state = con.prepareStatement(q);
                        rs =state.executeQuery();
        %>
            <table border="5" width="450">
                <tr>
                    <td>Book Id</td>
                    <td>Book Name</td>
                    <td>Author</td>
                    <td>Total Quantity</td>
                    <td>In Stock</td>
                </tr>
        <%
            String pg=request.getParameter("pgno");
                  int pgno=0;
                  if(pg==null)
                  {
                      pgno=0;
                  }
                  else
                  {
                      pgno=Integer.parseInt(pg)-1;
                  }
                    for(int i=0;i<pgno*bpp;i++)
                    {
                        rs.next();
                    }
                    int c=bpp;
                        while(rs.next()&&c-->0)
                        {
                            String bid=rs.getString("bid");
                            String bname=rs.getString("bname");
                            String author=rs.getString("author");
                            String totqty=rs.getString("totqty");
                            String stkqty=rs.getString("stkqty");
        %>
        <tr>
            <td><%=bid%></td>
            <td><%=bname%></td>
            <td><%=author%></td>
            <td><%=totqty%></td>
            <td><%=stkqty%></td>
        </tr>
                    
        <%
                        }
                        
                    }
                    catch(Exception e){
                        out.print(e);}
                }
                catch(Exception e){
                    out.println(e);}
        %>
            </table>
        </form>
    </body>
</html>
