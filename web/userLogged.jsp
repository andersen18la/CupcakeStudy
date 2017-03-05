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
            <h2> Your balance is:  <%= user.getBalance()%></h2>
            <form action="" id="cupcake">
                <script>
                    var theForm = document.forms["cupcake"];
                    function show(){
                        document.getElementById("cakePrice").innerHTML = cakePrice;
                    }
                </script>
                <label> Topping </label>
                <select id="topping" name='topping'
                        onchange="calculateTotal()">
                    <option value="None">Select Topping</option>
                    <option value="chocolate">chocolate(kr5)</option>
                    <option value="blueberry">blueberry(kr5)</option>
                    <option value="rasberry">rasberry(kr5)</option>
                    <option value="crispy">crispy(kr6)</option>
                    <option value="strawberry">strawberry(kr6)</option>
                    <option value="rum/raisin">rum/raisin(kr7)</option>
                    <option value="orange">orange(kr8)</option>
                    <option value="lemon">lemon(kr8)</option>
                    <option value="blue cheese">blue chees(kr9)</option>
                </select>

                <label> Bottom </label>
                <select id="bottom" name='bottom'
                        onchange="calculateTotal()">
                    <option value="None">Select Bottom</option>
                    <option value="chocolate">chocolate(kr5)</option>
                    <option value="Vanilla">Vanilla(kr5)</option>
                    <option value="Nutmeg">Nutmeg(kr5)</option>
                    <option value="Pistacio">Pistacio(kr6)</option>
                    <option value="Almond">Almond(kr7)</option>
                    <form>
                        Choose the quantity of cupcakes you want<br>
                        <input type="text" name="Quantity" id="Quantity" />
                        <button onclick="getTotal()">Click me</button>
                        
                       <%-- <input type="submit" id= "Calculate price" onclick="getTotal();" /> --%>
                       <div id="cakeprice"></div>
                        <div id="totalPrice"></div>
                    </form>
                    <form> 

                    </form>
                </select>
                <script>
                    var topping = new Array();
                    topping["chocolate"] = 5;
                    topping["blueberry"] = 5;
                    function getToppingPrice() {
                        var cakeToppingPrice = 0;
                        var theForm = document.forms["cupcake"];
                        var selectedTopping = theForm.elements["topping"];
                        cakeToppingPrice = topping[selectedTopping.value];
                        return cakeToppingPrice;
                    }

                    var bottom = new Array();
                    bottom["chocolate"] = 5;
                    bottom["Vanilla"] = 5;
                    function getBottomPrice() {
                        var cakeBottomPrice = 0;
                        var theForm = document.forms["cupcake"];
                        var selectedBottom = theForm.elements["bottom"];
                        cakeBottomPrice = bottom[selectedBottom.value];
                        return cakeBottomPrice;
                    }
                    function getQuantity() {
                        var theForm = document.forms["cupcake"];
                        var quantity = theForm.elements["quantity"];
                        var howMany = 0;
                        if (quantity.value != "") {
                            howMany = parseInt(qunatity.value);
                        }
                        return howMany;
                    }

                    function getTotal() {
                        var cakePrice = getToppingPrice() + getBottomPrice();
                        document.getElementById('totalPrice').innerHTML = "Total Price For CupCake kr: " + cakePrice;

                    }
                </script>

                <%--<%
                    ArrayList<Topping> topList = (ArrayList<Topping>) session.getAttribute("topList");
                    for (Topping topl : topList) {
                %> 
                <div class="radio">
                    <label><input type="radio" name="topping" value="topname"><%= topl.getTopName() + " kr:" + topl.getTopPrice()%></label><br>
                </div>

                <%}%>
                --%>
        </div>
    </form>

    <%--    <%
        ArrayList<Bottom> botList = (ArrayList< Bottom>) session.getAttribute("botList");
        for (Bottom botl : botList) {
    %>
    <label><input type="radio" name="bottom" value="botname"> <%= botl.getBotName() + " kr: " + botl.getBotPrice() %></label><br>

    <%}%>
    --%>


</div>
</center>

</body>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>
