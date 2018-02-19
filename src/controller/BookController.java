package controller;

import model.Book;

public class BookController {
    private InputController input = new InputController();

    public Book createNewBook() {
        int ISBN = input.getIntInput("Enter ISBN: ");
        String author = input.getStringInput("Enter author: ");
        String title = input.getStringInput("Enter title: ");
        String publisher = input.getStringInput("Enter publisher: ");
        String publication_year = input.getStringInput("Enter publication year: ");
        String price = input.getStringInput("Enter price: ");
        String type = input.getStringInput("Enter type: ");

        return new Book(ISBN, author, title, publisher, publication_year, price, type);
    }

    public String pickBookByName() {
        return input.getStringInput("Pick book by name: ");
    }


}

