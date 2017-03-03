<%-- 
    Document   : userLogged
    Created on : 02-03-2017, 08:34:30
    Author     : Lasse Andersen
--%>
<%@page import="Model.Bottom"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Topping"%>
<%@ page import="Model.User" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <title>Cupcake Home</title>
    </head>
    <body>




    <center> 
        <div class="container">
           
            <% User user = (User) session.getAttribute("user");%>
            <h1>  Cupcake Shop </h1>
            <form action="">
                <h2> Choose Topping</h2>

                <form>

                </form>
                <%
                    ArrayList<Topping> topList = (ArrayList<Topping>) session.getAttribute("topList");
                    for (Topping topl : topList) {
                %>
                <div class="radio">
                    <label><input type="radio" name="topping" value="topname"><%= topl.getTopName() + " kr:" + topl.getTopPrice()%></label><br>
                </div>




                <%}%>
        </div>
    </form>


    <h3>Choose Bottom</h3>
    <%
        ArrayList<Bottom> botList = (ArrayList< Bottom>) session.getAttribute("botList");
        for (Bottom botl : botList) {
    %>
    <label><input type="radio" name="bottom" value="botname"> <%= botl.getBotName() + " kr: " + botl.getBotPrice() %></label><br>

    <%}%>



    </div>
</center>

</body>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>
