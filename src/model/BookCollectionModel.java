package model;

import java.util.ArrayList;

public class BookCollectionModel {
    private ArrayList<Book> collectionOfBooks;

    public BookCollectionModel(){
        this.collectionOfBooks = new ArrayList<>();
    }

    public void addBookToCollection(Book book){
        collectionOfBooks.add(book);
    }

}
