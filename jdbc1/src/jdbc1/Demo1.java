package jdbc1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con=null;

        try {
            con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1db", // database
                "pranjali",                          // username
                "pranjali123"                        // password
            );
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}
