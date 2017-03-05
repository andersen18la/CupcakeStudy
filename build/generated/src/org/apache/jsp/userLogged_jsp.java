package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Bottom;
import java.util.ArrayList;
import Model.Topping;
import Model.User;

public final class userLogged_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <title>Cupcake Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <center> \n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            ");
 User user = (User) session.getAttribute("user");
      out.write("\n");
      out.write("            <h1>  Cupcake Shop </h1>\n");
      out.write("            <h2> Your balance is:  ");
      out.print( user.getBalance());
      out.write("</h2>\n");
      out.write("            <form action=\"\" id=\"cupcake\">\n");
      out.write("                <script>\n");
      out.write("                    var theForm = document.forms[\"cupcake\"];\n");
      out.write("                    function show(){\n");
      out.write("                        document.getElementById(\"cakePrice\").innerHTML = cakePrice;\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("                <label> Topping </label>\n");
      out.write("                <select id=\"topping\" name='topping'\n");
      out.write("                        onchange=\"calculateTotal()\">\n");
      out.write("                    <option value=\"None\">Select Topping</option>\n");
      out.write("                    <option value=\"chocolate\">chocolate(kr5)</option>\n");
      out.write("                    <option value=\"blueberry\">blueberry(kr5)</option>\n");
      out.write("                    <option value=\"rasberry\">rasberry(kr5)</option>\n");
      out.write("                    <option value=\"crispy\">crispy(kr6)</option>\n");
      out.write("                    <option value=\"strawberry\">strawberry(kr6)</option>\n");
      out.write("                    <option value=\"rum/raisin\">rum/raisin(kr7)</option>\n");
      out.write("                    <option value=\"orange\">orange(kr8)</option>\n");
      out.write("                    <option value=\"lemon\">lemon(kr8)</option>\n");
      out.write("                    <option value=\"blue cheese\">blue chees(kr9)</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <label> Bottom </label>\n");
      out.write("                <select id=\"bottom\" name='bottom'\n");
      out.write("                        onchange=\"calculateTotal()\">\n");
      out.write("                    <option value=\"None\">Select Bottom</option>\n");
      out.write("                    <option value=\"chocolate\">chocolate(kr5)</option>\n");
      out.write("                    <option value=\"Vanilla\">Vanilla(kr5)</option>\n");
      out.write("                    <option value=\"Nutmeg\">Nutmeg(kr5)</option>\n");
      out.write("                    <option value=\"Pistacio\">Pistacio(kr6)</option>\n");
      out.write("                    <option value=\"Almond\">Almond(kr7)</option>\n");
      out.write("                    <form>\n");
      out.write("                        Choose the quantity of cupcakes you want<br>\n");
      out.write("                        <input type=\"text\" name=\"Quantity\" id=\"Quantity\" />\n");
      out.write("                        <button onclick=\"show()\">Click me</button>\n");
      out.write("                        \n");
      out.write("                       ");
      out.write("\n");
      out.write("                       <div id=\"cakeprice\"></div>\n");
      out.write("                        <div id=\"totalPrice\"></div>\n");
      out.write("                    </form>\n");
      out.write("                    <form> \n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </select>\n");
      out.write("                <script>\n");
      out.write("                    var topping = new Array();\n");
      out.write("                    topping[\"chocolate\"] = 5;\n");
      out.write("                    topping[\"blueberry\"] = 5;\n");
      out.write("                    function getToppingPrice() {\n");
      out.write("                        var cakeToppingPrice = 0;\n");
      out.write("                        var theForm = document.forms[\"cupcake\"];\n");
      out.write("                        var selectedTopping = theForm.elements[\"topping\"];\n");
      out.write("                        cakeToppingPrice = topping[selectedTopping.value];\n");
      out.write("                        return cakeToppingPrice;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    var bottom = new Array();\n");
      out.write("                    bottom[\"chocolate\"] = 5;\n");
      out.write("                    bottom[\"Vanilla\"] = 5;\n");
      out.write("                    function getBottomPrice() {\n");
      out.write("                        var cakeBottomPrice = 0;\n");
      out.write("                        var theForm = document.forms[\"cupcake\"];\n");
      out.write("                        var selectedBottom = theForm.elements[\"bottom\"];\n");
      out.write("                        cakeBottomPrice = bottom[selectedBottom.value];\n");
      out.write("                        return cakeBottomPrice;\n");
      out.write("                    }\n");
      out.write("                    function getQuantity() {\n");
      out.write("                        var theForm = document.forms[\"cupcake\"];\n");
      out.write("                        var quantity = theForm.elements[\"quantity\"];\n");
      out.write("                        var howMany = 0;\n");
      out.write("                        if (quantity.value != \"\") {\n");
      out.write("                            howMany = parseInt(qunatity.value);\n");
      out.write("                        }\n");
      out.write("                        return howMany;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    function getTotal() {\n");
      out.write("                        var cakePrice = getToppingPrice() + getBottomPrice();\n");
      out.write("                        document.getElementById('totalPrice').innerHTML = \"Total Price For CupCake kr: \" + cakePrice;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
