package model;

public class Book {
    private int ISBN;
    private String author;
    private String title;
    private String publisher;
    private String publication_year;
    private String price;
    private String type;


    public Book(int ISBN, String author, String title, String publisher, String publication_year, String price, String type) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publication_year = publication_year;
        this.price = price;
        this.type = type;
    }

    public String toString() {
        return String.format("{%d} {%s} {%s} {%s} {%s} {%s} {%s}", ISBN, author, title, publisher, publication_year, price, type);
    }


    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublication_year() {
        return publication_year;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

}





