package dbprogramming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class dbprogramming {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver loaded");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected");

            Statement statement = connection.createStatement();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbprogramming.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbprogramming.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
