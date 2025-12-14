package jdbc1;

import java.sql.*;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        Connection con = null;

        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

          
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empdb",   // database name changed
                    "pranjali",                            // your username
                    "pranjali123"                          // your password
            );

            System.out.println("Connection Successful!");

            
            Statement st = con.createStatement();

            
            String updateQuery =
                    "UPDATE Studentdata SET mob_no='123456789' WHERE mob_no='7875892623'";
            st.executeUpdate(updateQuery);
            System.out.println("Mobile number updated!");

            
            ResultSet rs_students = st.executeQuery("SELECT * FROM Studentdata");

            System.out.println("\n--- Student Data After Update ---");
            while (rs_students.next()) {
                String name = rs_students.getString("name");
                String email = rs_students.getString("mail");
                String mob = rs_students.getString("mob_no");

                System.out.println("Name = " + name +
                                   ", Email = " + email +
                                   ", Mobile = " + mob);
            }

            
            ResultSet rs_pune = st.executeQuery(
                    "SELECT * FROM employee_data WHERE city='pune'"
            );

            ArrayList<String> pune_employees = new ArrayList<>();

            while (rs_pune.next()) {
                pune_employees.add(rs_pune.getString("emp_name"));
            }

            System.out.println("\nPune Employees: " + pune_employees);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

