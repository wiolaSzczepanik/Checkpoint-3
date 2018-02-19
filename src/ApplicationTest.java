import controller.BookController;
import model.AdminModel;
import model.Book;

public class ApplicationTest {
    public static void main(String[] args) {
        AdminModel admin = new AdminModel();
//        Book book = new Book();
        BookController bookManager = new BookController();

        System.out.println("As Jerzy I would like to add new book to my book collection!!!");

        System.out.println("create new book object");
        Book newBook = new Book("Jan kowalski", "Historia w lesie", "Jakikolwiek", "2017",39, "ebook");
        System.out.println(newBook.toString());


//        bookManager.createNewBook("Jan kowalski", "Historia w lesie", "Jakikolwiek", "2017",39, "ebook");


    }
}
