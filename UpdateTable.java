package projectjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";

        String updateSQL = "UPDATE Users SET id = ? WHERE username = ? ";
               
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setInt(1, 6613000);
            preparedStatement.setString(2, "tom");
//            preparedStatement.setInt(3, 123456);
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Table 'Users' UPDATE successfully!");

    }
}
