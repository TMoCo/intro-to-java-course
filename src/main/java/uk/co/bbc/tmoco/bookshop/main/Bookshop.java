package uk.co.bbc.tmoco.bookshop.main;

import uk.co.bbc.tmoco.bookshop.domain.Address;
import uk.co.bbc.tmoco.bookshop.domain.Author;
import uk.co.bbc.tmoco.bookshop.domain.Book;
import uk.co.bbc.tmoco.bookshop.domain.Publisher;

public class Bookshop {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("Welcome to the Java uk.co.bbc.tmoco.bookshop.main.Bookshop");
        System.out.println("============================");
        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress);
        System.out.println("uk.co.bbc.tmoco.bookshop.domain.Author: " + author);
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher =
                new Publisher("Tech Books Publishing Ltd.",
                        publisherAddress);
        System.out.println("uk.co.bbc.tmoco.bookshop.domain.Publisher: " + publisher);
        Book book = new Book("Java Unleashed",
                author, publisher, 15.95);
        System.out.println("uk.co.bbc.tmoco.bookshop.domain.Book: " + book);
        System.out.println("Calculating the Sales Discount price");
        book.setSaleDiscount(10.0);
        System.out.println("Sale price of book: " +
                book.calculateSalePrice());
    }
}
