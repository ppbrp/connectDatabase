
package dbprogramming;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab13 {
   public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            
            String sql = "UPDATE student SET email = ? WHERE studentID = ? "; 
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"aaaa@kmutt.ac.th"); //i = ตำแหน่ง
            preparedStatement.setString(2, "111111");
            preparedStatement.executeUpdate();

           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
