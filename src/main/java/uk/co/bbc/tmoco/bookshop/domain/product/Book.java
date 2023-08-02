package uk.co.bbc.tmoco.bookshop.domain.product;

import uk.co.bbc.tmoco.bookshop.domain.contact.Author;
import uk.co.bbc.tmoco.bookshop.domain.contact.Publisher;

/**
 * Extensible Book class (eg: could be a textbook, a book of fiction, etc).
 */
public non-sealed class Book extends Product {
    private Author author;
    private Publisher publisher;

    public static int instanceCount = 0;

    public Book(String title, Author author, Publisher publisher, double price) {
        this.title = title;
        this.price = price;
        this.saleDiscount = 0.0f;
        this.author = author;
        this.publisher = publisher;
        instanceCount++;
    }

    public static int getInstanceCount() { return instanceCount; }

    @Override
    public void print() {
        System.out.println(String.format("Book information: %s", this));
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
