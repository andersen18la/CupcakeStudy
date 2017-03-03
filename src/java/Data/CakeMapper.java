package Data;

import Model.Bottom;
import Model.Topping;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CakeMapper {

    private Connection con;
    User user = new User();
    Topping top = null;
    Bottom bot = null;

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
    
    public ArrayList<Topping> getTop () throws SQLException{
        String Sql = "select * from topping;";
        ArrayList<Topping> topList = new ArrayList<>();
        try {
            PreparedStatement preStmt = con.prepareStatement(Sql);
            ResultSet rs = preStmt.executeQuery();
            while(rs.next()){
                int topId = rs.getInt("topID");
                String topName = rs.getString("topName");
                int topPrice = rs.getInt("topPrice");
                topList.add(new Topping(topId, topName, topPrice));
                
            }
        }catch (SQLException ex) {
            Logger.getLogger(CakeMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return topList;
    }
      public ArrayList<Bottom> getBot () throws SQLException{
        String Sql = "select * from bottom;";
        ArrayList<Bottom> botList = new ArrayList<>();
        try {
            PreparedStatement preStmt = con.prepareStatement(Sql);
            ResultSet rs = preStmt.executeQuery();
            while(rs.next()){
                int botID = rs.getInt("botID");
                String botName = rs.getString("botName");
                int botPrice = rs.getInt("botPrice");
                botList.add(new Bottom(botID, botName, botPrice));
                
            }
        }catch (SQLException ex) {
            Logger.getLogger(CakeMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return botList;
    }
}



