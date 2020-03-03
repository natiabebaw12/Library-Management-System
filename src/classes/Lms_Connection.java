package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Lms_Connection {

    public static Connection lms_con = null;//connection declaration

    public void createConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/lms";
            String user = "root";
            String password = "nati brown";

            lms_con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to lms Database");
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
