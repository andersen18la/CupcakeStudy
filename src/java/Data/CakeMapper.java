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
    public Book getBook(int ISBN) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Book book = null;

        try {
            stmt = con.prepareStatement("select * from books where ISBN = ?");
            stmt.setInt(1, ISBN);
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                book = new Book(ISBN, rs.getString("title"));
          
            }
        } catch (SQLException e) {
            System.out.println("Fail in BookMapper - getBook");
            System.out.println(e.getMessage());
        }       
        return book;
    }    
}
