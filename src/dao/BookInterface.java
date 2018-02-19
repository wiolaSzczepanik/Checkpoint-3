package dao;

import model.Book;

import java.util.ArrayList;

public interface BookInterface {

    void insertToDBNewBook(Book book);

    ArrayList<Book> selectAllBooks();

    Book selectOneBookByTitle(String nameBook);

    void deleteSelectBook(Book pickedBook);
}
