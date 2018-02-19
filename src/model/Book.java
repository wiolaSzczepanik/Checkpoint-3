package model;

public class Book {
    private String author;
    private String title;
    private String publisher;
    private String publication_year;
    private int price;
    private String type;


    public Book(String author, String title, String publisher, String publication_year, int price, String type) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publication_year = publication_year;
        this.price = price;
        this.type = type;
    }

    public String toString() {
        return String.format("{%s} {%s} {%s} {%s} {%d} {%s}", author, title, publisher, publication_year, price, type);
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

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

}


