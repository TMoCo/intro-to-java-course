package uk.co.bbc.tmoco.bookshop.domain;

public class Book {
    private String title;
    private double price;
    private Author author;
    private Publisher publisher;

    private double saleDiscount;

    public Book(String title, Author author, Publisher publisher, double price) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.saleDiscount = 0.0f;
    }

    public double calculateSalePrice() {
        return price * (1 - saleDiscount / 100.f);
    }

    public double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return String.format("uk.co.bbc.tmoco.bookshop.domain.Book[title='%s', author=%s, publisher=%s, " +
                        "price=%,.2f", title, author, publisher, price);
    }
}
