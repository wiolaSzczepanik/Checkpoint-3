package controller;

import dao.BookDB;
import model.Book;

public class AdminController {
    BookController bookMenager = new BookController();
    BookDB bookDB = new BookDB();

    public void addNewBook() {
        Book newBook  = bookMenager.createNewBook();
        bookDB.insertToDBNewBook(newBook);
    }


}
