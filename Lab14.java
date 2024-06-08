
package dbprogramming;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;


public class Lab14 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "nine2547";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            DatabaseMetaData dbMetaData = connection.getMetaData();
            System.out.println("database URL: " + dbMetaData.getURL());
            System.out.println("database product name : " + dbMetaData.getDatabaseProductName());
            System.out.println("database product version : " + dbMetaData.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + dbMetaData.getDatabaseProductName());
            System.out.println("JDBC driver version: " + dbMetaData.getDatabaseProductVersion());
            System.out.println("JDBC driver major version: " + dbMetaData.getDriverMajorVersion());
            System.out.println("JDBC driver minor version: " + dbMetaData.getDriverMinorVersion());
            System.out.println("Max number of connections " + dbMetaData.getMaxConnections());
            System.out.println("MaxTableNameLenght: " + dbMetaData.getMaxTableNameLength());
            System.out.println("MaxColumnInTable " + dbMetaData.getMaxColumnNameLength());
            connection.close();
            





        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab14.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab14.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
