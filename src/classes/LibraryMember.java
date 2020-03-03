package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibraryMember extends Person {

    private int id;
    private String major;
    private String expireDate;

    public void addMemberInfo(int id, String major, String expireDate) {
        this.id = id;
        this.major = major;
        this.expireDate = expireDate;
    }
         //inser in to databse
    public void register(LibraryMember info) {

        try {
            PreparedStatement data;

            data = Lms_Connection.lms_con.prepareStatement("INSERT INTO library_member VALUES(?,?,?,?,?,?,?)");
            data.setInt(1, id);
            data.setString(2, info.getFullName());
            data.setString(3, major);
            data.setString(4, info.getGender());
            data.setInt(5, info.getContactNo());
            data.setString(6, info.getAddress());
            data.setString(7, expireDate);

            data.execute();
            System.out.println("member has been recorded");
            data.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
              //update the database
    public void update(LibraryMember info) {

        PreparedStatement data;
        String update = "UPDATE library_member SET name=?, major=?, gender=?,contact=?,address=?, expire_date=? WHERE id=? ";
        try {
            data = Lms_Connection.lms_con.prepareStatement(update);

            data.setString(1, info.getFullName());
            data.setString(2, major);
            data.setString(3, info.getGender());
            data.setInt(4, info.getContactNo());
            data.setString(5, info.getAddress());
            data.setString(6, expireDate);
            data.setInt(7, id);

            data.executeUpdate();
            System.out.println("member updated");
            data.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
        //delete from database
    public void delete(int id) {
        
        PreparedStatement data;
        try {
            String remove = "DELETE FROM library_member WHERE id = ?";
            data = Lms_Connection.lms_con.prepareStatement(remove);
            data.setInt(1, id);
            data.executeUpdate();
            System.out.println("done");
            data.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
