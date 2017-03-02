package Data;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CakeMapper {

    private Connection con;
    User user = new User();

    public CakeMapper() throws Exception {
        con = new DB().getConnection();
    }

    public boolean getUser(String username, String password) throws SQLException {
        boolean status = false;
        ResultSet rs = null;
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("select * from login where user=? and password=?");
            stmt.setString(1, username);
            stmt.setString(2, password);

            rs = stmt.executeQuery();
            status = rs.next();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return status;
    }

    public User getLogin(User user) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String username = user.getUsername();
        String password = user.getPassword();
        String searchQuery = "select * from user where userid =? and password =?;";

        System.out.println("your username is " + username);
        System.out.println("your password is " + password);
        System.out.println("Query: " + searchQuery);

        try {
           stmt= (PreparedStatement) con.createStatement();
           rs = stmt.executeQuery(searchQuery);
           boolean more = rs.next();
           
           if(!more){
               System.out.println("Sorry, you are not a registred user! Please sign up first");
               user.setValid(false);
           } else if(more){
               String userId = rs.getString("userid");
               String pass = rs.getString("password");
               System.out.println("Welcome " + userId);
               user.setUsername(userId);
               user.setPassword(pass);
               user.setValid(true);
           }
        } catch (Exception ex) {
            System.out.println("Log in failed: An Exception has occurred!" + ex);
        }  
         finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return user;
    }
    public User login(String username, String password)
    {
        if("andersen18".equals(username) && "12345678".equals(password))
        {
            return new User("Lasse", password);
        }
        return null;
    }
}
