package projectjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Connected to the database!");
            }

            String insertSQL = "INSERT INTO Users(id,username,password) "
                    + "VALUES(? , ? , ?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setInt(1,6613000);
            preparedStatement.setString(2, "tom");
            preparedStatement.setInt(3, 123456);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,6613001);
            preparedStatement.setString(2, "pheam");
            preparedStatement.setInt(3, 123456);
            preparedStatement.executeUpdate();
            preparedStatement.setInt(1,6613002);
            preparedStatement.setString(2, "jum");
            preparedStatement.setInt(3, 123456);
            preparedStatement.executeUpdate();
            System.out.println("Table 'Users' Insert successfully!");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
