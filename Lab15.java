
package dbprogramming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Lab15 {
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
            ResultSetMetaData rsMetaData = results.getMetaData();
            
            System.out.println(rsMetaData.getColumnCount());
            
            for(int i = 1 ; i <= rsMetaData.getColumnCount(); i++){
                System.out.printf("%-15s \t" , rsMetaData.getColumnName(i));
            }
            System.out.println();
            
            while (results.next()){
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                    System.out.printf("%-15s \t" , results.getString(i)); 
                }
                System.out.println();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
