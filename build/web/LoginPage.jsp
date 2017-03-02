<%-- 
    Document   : theJSPpart
    Created on : 27-02-2017, 11:24:33
    Author     : Lasse Andersen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
           
        Please enter your username
        <input type="text" name="un"/><br>
        
        Please enter your password
        <input type="text" name="pw"/><br>
        
        <input type="submit"value="Login">
    </form>
    </body>
</html>
