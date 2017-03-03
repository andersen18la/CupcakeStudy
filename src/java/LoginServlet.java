/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Data.CakeMapper;
import Model.Bottom;
import Model.Topping;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lasse Andersen
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String test = request.getParameter("test");
            HttpSession session = request.getSession();
            CakeMapper cm = new CakeMapper();
            ArrayList<Topping> topList = (ArrayList<Topping>) request.getSession().getAttribute("topList");
            ArrayList<Bottom> botList = (ArrayList<Bottom>) request.getSession().getAttribute("botList");
            
            if( topList == null){
                topList = cm.getTop();
                session.setAttribute("topList", topList);
            } else {
              session.setAttribute("topList", topList);
            }
            
            if(botList == null){
                botList = cm.getBot();
                session.setAttribute("botList", botList);
            }else {
                session.setAttribute("botList", botList);
            }
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                
                switch (test) {
                    case "login":
                        session = request.getSession();
                        String email = request.getParameter("email");
                        String pw = request.getParameter("password");
                        User user = cm.getEvilUser(email, pw);
                        if (user == null) {
                            response.sendRedirect("index.html");
                            return;
                        } else {
                            session.setAttribute("user", user);
                            response.sendRedirect("userLogged.jsp");
                            return;
                        }
                        
                        default:
                        response.sendRedirect("index.html");
                        break;
                            
                }
            }
        }   catch (Exception ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
