<%-- 
    Document   : userLogged
    Created on : 02-03-2017, 08:34:30
    Author     : Lasse Andersen
--%>
 <%@ page import="Model.User" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Logged Successfully</title>
    </head>
    <body>
    <center> 
        <% User currentUser = (User (session.getAttribute("currentSessionUser")));%>
        Welcome <%=currentUser.getUsername()+ "" + currentUser.getPassword()%>
    </center>
        <h1>Hello World!</h1>
    </body>
    
</html>
