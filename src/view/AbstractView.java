package view;

import model.Book;

import java.util.ArrayList;

public abstract class AbstractView {

    public String displayText(String text){
        return text;
    }

    public abstract void displayAllBooks(ArrayList<Book> books);
}
