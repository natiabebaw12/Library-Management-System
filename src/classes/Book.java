package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Book {
    
    private int isbn;
    private String title;
    private String author;
    private int editionNo;
    private int quantity;
    private String subject;
    private int shelfNo;
    private String genre;

    public void addBooInfo1(int isbn, String title, String author, int editionNo) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.editionNo = editionNo;

    }

    public void addBookInfo2(int quantity, String subject, int shelfNo, String genre) {
        this.quantity = quantity;
        this.subject = subject;
        this.shelfNo = shelfNo;
        this.genre = genre;

    }

    //inser in to databse
    public void register() {

        try {
            PreparedStatement data;

            data = Lms_Connection.lms_con.prepareStatement("INSERT INTO books VALUES(?,?,?,?,?,?,?,?)");
            data.setString(1, title);
            data.setString(2, author);
            data.setInt(3, isbn);
            data.setString(4, subject);
            data.setInt(5, editionNo);
            data.setInt(6, quantity);
            data.setInt(7, shelfNo);
            data.setString(8, genre);

            data.execute();
            System.out.println("book has been recorded");
            data.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    //update the database
    public void update() {

        PreparedStatement data;
        String update = "UPDATE books SET title=?, author=?, subject=?,editionNo=?,quantity=?,shelfNo=?, genre=? WHERE isbn=? ";
        try {
            data = Lms_Connection.lms_con.prepareStatement(update);

            data.setString(1, title);
            data.setString(2, author);
            data.setString(3, subject);
            data.setInt(4, editionNo);
            data.setInt(5, quantity);
            data.setInt(6, shelfNo);
            data.setString(7, genre);
            data.setInt(8, isbn);

            data.executeUpdate();
            System.out.println("book updated");
            data.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //delete from database
    public void delete(int isbn) {
        
        PreparedStatement data;
        try {
            String remove = "DELETE FROM books WHERE isbn = ?";
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
