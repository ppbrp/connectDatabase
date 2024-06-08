package dbprogramming;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Lab8 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);
            
            while (results.next()){
                System.out.println(results.getString(1) + " " + results.getString(2) + " " + results.getString(3) + " " + results.getString(4) + " " + results.getString(5) ); //index
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
