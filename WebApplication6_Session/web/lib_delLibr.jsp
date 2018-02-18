<%-- 
    Document   : lib_delLibr
    Created on : 21 Jun, 2017, 1:58:52 PM
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
//                    }
//                    else if(pass==null||pass.equals(""))
//                    {
//            %>
<!--//                        <form action="#" method="post">
//                        User: <input type="text" name="user" value=<%=user%> disabled ><br>
//                                <input type="hidden" name="user" value=<%=user%> >
//                        New Password : <input type="text" name="pass" placeholder="Enter Password"><br><br>
//                        <input type="submit" value="Edit">   -->
            <%      }
                    else{
                    boolean ufound=false;
                    String allpass[]=cpass.split(",");
                    for(int i=0;i<alluser.length-1;i++)
                    {
                        if(alluser[i].equals(user))
                        {
                            ufound=true;
                        }
                        if(ufound)
                        {
                            alluser[i]=alluser[i+1];
                            allpass[i]=allpass[i+1];
                        }
                    }    
                    cuser=alluser[0];
                    cpass=allpass[0];
                    for(int i=1;i<allpass.length-1;i++){
                    cuser=cuser+","+alluser[i];
                    cpass=cpass+","+allpass[i];
                    }
                    response.addCookie(new Cookie("librp",cpass));
                    response.addCookie(new Cookie("libru",cuser));
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
    </body>
</html>
