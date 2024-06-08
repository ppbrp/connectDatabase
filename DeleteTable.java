
package projectjava;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";

        String deleteTableSQL = "DROP TABLE IF EXISTS Users";
        
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Connected to the database!");
            }
            
            Statement statement = connection.createStatement();
            statement.execute(deleteTableSQL);
            System.out.println("Table 'Users' deleted successfully!");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DeleteTable.class.getName()).log(Level.SEVERE, null, ex);
        }
            

       
            
       
    }
}


//
//package projectjava;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class DeleteTable {
//    public void deleteAccount() {
//        
//        Connection connection = muhammad.connect();
//        String deleteTableSQL = "DROP TABLE IF EXISTS Users";
//        Statement statement;
//   
//        try {
//            
//            statement = connection.createStatement();
//            ResultSet results = statement.executeQuery(deleteTableSQL);
//           
//            System.out.println("Table 'Users' deleted successfully!");
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(DeleteTable.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            
//
//       
//            
//       
//    }
//}
