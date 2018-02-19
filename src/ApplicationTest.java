import controller.AdminController;
import model.AdminModel;
import model.Book;

public class ApplicationTest {
    public static void main(String[] args) {
        AdminModel admin = new AdminModel();
        AdminController adminMenager = new AdminController();


        System.out.println("TEST 1====>>>create new book object>>>hardcode");
        Book newBook = new Book(12131212, "Jan kowalski", "Historia w lesie", "Jakikolwiek", "2017", "39", "ebook");
        System.out.println(newBook.toString());

        System.out.println("As Jerzy I would like to add new book to my book collection!!!");

        adminMenager.addNewBook();

        System.out.println("Jerzy want to display all books, and pick one to edit");
        System.out.println("TEST 2 ====>>>>Only display");
        adminMenager.displayAllMyBooks();

        System.out.println("TEST 3 ===>>>>As Jerzy I would like to delete book from collection");
        Book pickedBook = adminMenager.pickBookByName();
        adminMenager.deleteBook(pickedBook);

        System.out.println("TEST 4 ====>>>As Jerzy I would like to edit book from collection");
//        Book pickedBook1 = adminMenager.pickBookByName();
//        adminMenager.editBook(pickedBook1);


    }
}
