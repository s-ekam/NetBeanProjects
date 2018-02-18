<%-- 
    Document   : form
    Created on : 14 Jun, 2017, 1:34:54 PM
    Author     : Ekam
--%>

<%@page import="java.util.ArrayList"%>
<%
    String user=request.getParameter("user");
    String pass=request.getParameter("pass");
    String phn=request.getParameter("phn");
//    out.println(user+"\n"+pass+"<br>");
    String phUser="Enter_UserName";
    String phPass="Enter_Password";
    String phPhone="Enter_Phone_No";
    ArrayList ar=new ArrayList();
    if(user==null)
    {}
    else if(user.equals(""))
    {
        ar.add("user");
        phUser="FILL_THIS_FORM";
    }
    if(pass==null)
    {}
    else if(pass.equals(""))
    {
        ar.add("Password");
        phPass="FILL_THE_PASSWORD";
    }
    if(phn==null)
    {}
    else if(phn.equals(""))
    {
        ar.add("Phone");
        phPhone="FILL_THE_Phone";
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
    </head>
    <body>
        <form method="post" action="#">
            User :  <%
                        if(user==null || user.equals(""))
                        {
                            out.print("<input type='text' name='user'  placeholder="+phUser+"><br>");
                        }
                        else if(!user.equals(""))
                        {
                            out.print("<input type='text' name='user'  value="+user+"><br>");
                        }
                    %>
            Pass : <%
                        if(pass==null||pass.equals(""))
                        {
                            out.print("<input type='text' name='pass'  placeholder="+phPass+"><br>");
                        }
                        else if(!pass.equals(""))
                        {
                            out.print("<input type='text' name='pass'  value="+pass+"><br>");
                        }
                    %>
            Phone : <%
                        if(phn==null||phn.equals(""))
                        {
                            out.print("<input type='text' name='phn'  placeholder="+phPhone+"><br>");
                        }
                        else if(!phn.equals(""))
                        {
                            out.print("<input type='text' name='phn'  value="+phn+"><br>");
                        }
                    %>
            <input type="submit" name="b1" value="Add">
        </form>
            <p>
                <font color="red"> <b>
                    <ol type="I">
                <%
                    if(!ar.isEmpty())
                    {
                        for(int i=0;i<ar.size();i++)
                            out.print("<li>"+ar.get(i)+"</li>");
                    }
                    else
                    {
                        out.println("Successfull");
                    }
                    
                %>
                    </ol>
                </b><font>
            </p>
    </body>
</html>
