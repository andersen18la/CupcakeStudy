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
}
