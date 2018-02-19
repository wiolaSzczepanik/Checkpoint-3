package view;

import model.Book;

import java.util.ArrayList;

public class BookView extends AbstractView{

    public String displayText(String text){
        return super.displayText(text);
    }

    @Override
    public void displayAllBooks(ArrayList<Book> books) {
        int i = 0;
        for(Book book: books){
            System.out.println(i +"--->>>" + book.toString());
            i ++;
        }
    }
}
