package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Librarian extends Person {

    private String password;
    private String shift;

    public void addLibrarianInfo(String password, String shift) {
        this.shift = shift;
        this.password = password;

    }
        //inser in to databse
    public void register(Librarian info) {

        try {
            PreparedStatement data;
            data = Lms_Connection.lms_con.prepareStatement("INSERT INTO librarian VALUES(?,?,?,?,?,?)");
            data.setString(1, info.getFullName());
            data.setString(2, info.getGender());
            data.setString(3, info.getAddress());
            data.setInt(4, info.getContactNo());
            data.setString(5, password);
            data.setString(6, shift);
            data.execute();
            System.out.println("insertion completed");
            data.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        //update the database
    public void update(Librarian info) {

        PreparedStatement data;
        String update = "UPDATE librarian SET gender=?, address=?, contact=? WHERE name=? ";
        try {
            data = Lms_Connection.lms_con.prepareStatement(update);

            data.setString(1, info.getGender());
            data.setString(2, info.getAddress());
            data.setInt(3, info.getContactNo());
            data.setString(4, info.getFullName());
            data.executeUpdate();
            System.out.println("updated");
            data.close();
        } catch (SQLException e) {
              System.out.println(e.getMessage());
        }

    }
           //delete from database
    public void delete(String name) {
        
          PreparedStatement data;
        try {
            String remove = "DELETE FROM librarian WHERE name = ?";
          data = Lms_Connection.lms_con.prepareStatement(remove);
             data.setString(1, name);
             data.executeUpdate();
            System.out.println("done");
             data .close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
