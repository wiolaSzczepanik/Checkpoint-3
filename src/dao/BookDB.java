package dao;

import model.Book;

import java.sql.*;
import java.util.ArrayList;

public class BookDB implements BookInterface {

    @Override
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

    @Override
    public ArrayList<Book> selectAllBooks() {
        ArrayList<Book> books = new ArrayList<>();
        try
                (Connection c = createConnection();
                 Statement stmt = c.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM books ;")
                ) {

            while (rs.next()) {
                Book book = new Book(rs.getInt("ISBN"), rs.getString("author"),
                        rs.getString("title"), rs.getString("publisher"),
                        rs.getString("publication_year"), rs.getString("price"),
                        rs.getString("type"));
                books.add(book);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return books;
    }

    @Override
    public Book selectOneBookByTitle(String nameBook) {
        Book bookToEdit = null;
        String sql = "SELECT * FROM books WHERE title = " + nameBook + " ;";

        try (Connection conn = this.createConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Book book = new Book(rs.getInt("ISBN"), rs.getString("author"),
                        rs.getString("title"), rs.getString("publisher"),
                        rs.getString("publication_year"), rs.getString("price"),
                        rs.getString("type"));
                bookToEdit = book;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bookToEdit;
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

//    public void updateBook(Book pickedBook){
//        }

    public void deleteBook(Book pickedBook) {
        String sql = "DELETE FROM books WHERE title = ?";

        try (Connection conn = this.createConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, pickedBook.getTitle());
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}







