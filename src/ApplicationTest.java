import controller.AdminController;
import controller.BookController;
import model.AdminModel;
import model.Book;

public class ApplicationTest {
    public static void main(String[] args) {
        AdminModel admin = new AdminModel();
        AdminController adminMenager = new AdminController();
//        Book book = new Book();
        BookController bookManager = new BookController();


        System.out.println("create new book object>>>hardcode");
        Book newBook = new Book(12131212, "Jan kowalski", "Historia w lesie", "Jakikolwiek", "2017","39", "ebook");
        System.out.println(newBook.toString());

//        System.out.println("create new book object>>>with user input");
//        Book createdBook = bookManager.createNewBook();
//        System.out.println(createdBook.toString());

        System.out.println("As Jerzy I would like to add new book to my book collection!!!");

        adminMenager.addNewBook();

        System.out.println("Jerzy want to display all books, and pick one to edit");
        adminMenager.displayAllMyBooks();




    }
}
