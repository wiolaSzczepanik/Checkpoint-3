package controller;

import dao.BookDB;
import model.Book;
import view.BookView;

import java.util.ArrayList;

public class AdminController {
    BookView bookView = new BookView();
    BookController bookMenager = new BookController();
    BookDB bookDB = new BookDB();

    public void addNewBook() {
        Book newBook  = bookMenager.createNewBook();
        bookDB.insertToDBNewBook(newBook);
    }

    public void displayAllMyBooks() {
        ArrayList<Book> collectionOfBooks = bookDB.selectAllBooks();
        bookView.displayAllBooks(collectionOfBooks);
    }

    public Book pickBookByName() {
        ArrayList<Book> collectionOfBooks = bookDB.selectAllBooks();
        String nameBook = bookMenager.pickBookByName();
        for (Book book : collectionOfBooks){
            if(book.getTitle().equals(nameBook)){
                return book;
            }else{
                bookView.displayText("Not existing book");
            }
        }
        return null;
    }


    public void deleteBook(Book pickedBook) {
        bookDB.deleteBook(pickedBook);
    }
}
