package controller;

import model.Book;

import java.util.Scanner;

public class BookController {
    InputController input = new InputController();

    public Book createNewBook() {
        String author = input.getStringInput("Enter author: ");
        String title = input.getStringInput("Enter title: ");
        String publisher = input.getStringInput("Enter publisher: ");
        String publication_year = input.getStringInput("Enter publication year: ");
        String price = input.getStringInput("Enter price: ");
        String type = input.getStringInput("Enter type: ");

        return new Book (author,title,publisher, publication_year,price,type);



    }



    //    public int getIntInput(String message) {
    //        System.out.println(message);
    //        Scanner scanner = new Scanner(System.in);
    //        int  input = scanner.nextInt();
    //        return input;
    //    }
    }

