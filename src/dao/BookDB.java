package dao;

import model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDB {

    public void insertToDBNewBook(Book book) {
        String sql = "INSERT INTO books(ISBN, author, title, publisher, publication_year, price, type) VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = this.createConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, book.getISBN());
            pstmt.setString(2, book.getAuthor());
            pstmt.setString(3, book.getTitle());
            pstmt.setString(4, book.getPublisher());
            pstmt.setString(5, book.getPublication_year());
            pstmt.setString(6, book.getPrice());
            pstmt.setString(7, book.getType());

            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection createConnection() throws Exception {

        String url = "jdbc:sqlite:/home/wiola/codecool/JAVA/CHECKPOINT_PRZYGOTOWANIE/Checkpoint-3/src/resource/jerzydatabase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    }



