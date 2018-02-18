<%-- 
    Document   : lib_editLibr
    Created on : 21 Jun, 2017, 5:25:10 AM
    Author     : Ekam
--%>

<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Librarian</title>
        <style type="text/css">
            body
            {
                background-image: url("");
            }
            box
            {
                border : 2px solid black;
                height : 225px;
                width : 800;
                position: fixed ;
                top : 35%;
                left : 37%;
            }
            
        </style>
    </head>
    <body>
    <box>
            <%
                String user=request.getParameter("user");
                String pass=request.getParameter("pass");
                
                if(user!=null&&!user.equals(""))
                {
                    String cuser=null;
                    String cpass= null;
                    Cookie ck[] = request.getCookies();
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
                    boolean present=false;
                    String alluser[]=cuser.split(",");
                    for(String str : alluser)
                    {
//                        out.println(user+"  "+ str);
                    if(str.equalsIgnoreCase(user))
                        {
                            present=true;
                            break;
                        }
                    }
                    if(!present)
                    {
            %>
                        <p style="font-size: 30px;color: red">
                            Enter Valid UserName
                            <%=user%>here
                        </p>
                        <form action="#" method="post">
                        User:<input type="text" name="user" placeholder="Enter Libr name to Edit"><br>
                        <input type="submit" value="Edit">
            <%
                    }
                    else if(pass==null||pass.equals(""))
                    {
            %>
                        <form action="#" method="post">
                        User: <input type="text" name="user" value=<%=user%> disabled ><br>
                                <input type="hidden" name="user" value=<%=user%> >
                        New Password : <input type="text" name="pass" placeholder="Enter Password"><br><br>
                        <input type="submit" value="Edit">   
            <%      }
                    else{
                    String allpass[]=cpass.split(",");
                    for(int i=0;i<alluser.length;i++)
                    {
                        if(alluser[i].equals(user))
                        {
                            allpass[i]=pass;
                        }
                    }    
//                    cuser=alluser[0];
                    cpass=allpass[0];
                    for(int i=1;i<allpass.length;i++){
//                    cuser=cuser+","+alluser[i];
                    cpass=cpass+","+allpass[i];
                    }
                    response.addCookie(new Cookie("librp",cpass));
            %>
            <p style="font-size: 20px">
                Changed Successfully
            </p>
            <a href="lib_Admin.jsp">Admin</a>
            <%

                    }

                }
                else
                {
            %>
                    <form action="#" method="post">
                    User:
                    <input type="text" name="user" placeholder="Enter Libr name to Edit"><br>
                    <input type="submit" value="Edit">
            <%    }
            %>
        </form>
        </box>
    </body>
</html>
