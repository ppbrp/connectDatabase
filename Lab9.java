
package dbprogramming;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab9 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO student(studentID,firstname,lastname,email,deptID) "
                    + "VALUES('111111' , 'AAAA' , 'BBBB' , 'aaaa@gmail.com' , 'IT')";
            statement.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
