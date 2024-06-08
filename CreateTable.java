
package projectjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";

        String createTableSQL = "CREATE TABLE Users ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "username VARCHAR(50) NOT NULL, "
                + "password VARCHAR(50) NOT NULL"
                + ")";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Connected to the database!");
            }
            
            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Table 'Users' created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
