<%-- 
    Document   : welcome
    Created on : 01-03-2017, 21:11:08
    Author     : Lasse Andersen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome <%=session.getAttribute("email") %></title>
    </head>
    <body>
        <h3>Login Successful!!!</h3>
        <h4>Hello, <%=session.getAttribute("email") %></h4>
    </body>
</html>
