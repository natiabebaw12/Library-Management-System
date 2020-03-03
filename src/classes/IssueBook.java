package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IssueBook {

    String title, subject, returnDate, issuedDate, memberName;
    int isbn, shelfNo, memberId;

    public void setBookData(String title, String subject, String returnDate, String issuedDate, int isbn, int shelfNo) {

        this.title = title;
        this.subject = subject;
        this.isbn = isbn;
        this.shelfNo = shelfNo;
        this.returnDate = returnDate;
        this.issuedDate = issuedDate;
    }

    public void setMemberDate(String memberName, int memberId) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
    //inser in to databse
    public void register(IssueBook info) {

        try {
            PreparedStatement data;

            data = Lms_Connection.lms_con.prepareStatement("INSERT INTO issued_book VALUES(?,?,?,?,?,?,?,?)");

            data.setInt(1, info.isbn);
            data.setString(2, info.title);
            data.setString(3, info.subject);
            data.setInt(4, info.shelfNo);
            data.setInt(5, info.memberId);
            data.setString(6, info.memberName);
            data.setString(7, info.issuedDate);
            data.setString(8, info.returnDate);
            data.execute();
            System.out.println("recorded");
            data.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
            //delete from database
    public void delete(int isbn) {
         PreparedStatement data;
        try {
            String remove = "DELETE FROM issued_book WHERE book_isbn = ?";
            data = Lms_Connection.lms_con.prepareStatement(remove);
            data.setInt(1, isbn);
            data.executeUpdate();
            System.out.println("done");
            data.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
