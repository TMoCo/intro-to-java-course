package uk.co.bbc.tmoco.bookshop.domain.product;

import uk.co.bbc.tmoco.bookshop.domain.contact.Author;
import uk.co.bbc.tmoco.bookshop.domain.contact.Publisher;

public class Book extends Product {
    private Author author;
    private Publisher publisher;

    public Book(String title, Author author, Publisher publisher, double price) {
        super(title, price);
        this.author = author;
        this.publisher = publisher;
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
        return String.format("Book[%s, author=%s, publisher=%s, ",
         super.toString(), author, publisher);
    }
}
