package model;

public class Book {
    private String author;
    private String title;
    private String publisher;
    private String publication_year;
    private String price;
    private String type;


    public Book(String author, String title, String publisher, String publication_year, String price, String type) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publication_year = publication_year;
        this.price = price;
        this.type = type;
    }

    public String toString() {
        return String.format("{%s} {%s} {%s} {%s} {%s} {%s}", author, title, publisher, publication_year, price, type);
    }



}


