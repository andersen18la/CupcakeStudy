package Data;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CakeMapper {

    private Connection con;
    User user = new User();

    public CakeMapper() throws Exception {
        con = new DB().getConnection();
    }



    public User getEvilUser(String email, String password) {
        String Sql = "select * from user where email =? and password =?;";
        try {
            PreparedStatement preStmt = con.prepareStatement(Sql);
            preStmt.setString(1, email);
            preStmt.setString(2, password);
            ResultSet rs = preStmt.executeQuery();
            if(rs.next()){
                String mail = rs.getString("email");
                String pass = rs.getString("password");
                int balance = rs.getInt("balance");
                String uid = rs.getString("userId");
                return new User(uid, email, password, balance);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CakeMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

