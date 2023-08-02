package uk.co.bbc.tmoco.bookshop.main;

import uk.co.bbc.tmoco.bookshop.domain.contact.Address;
import uk.co.bbc.tmoco.bookshop.domain.contact.Author;
import uk.co.bbc.tmoco.bookshop.domain.contact.Publisher;
import uk.co.bbc.tmoco.bookshop.domain.product.Book;
import uk.co.bbc.tmoco.bookshop.domain.product.Sales;
import uk.co.bbc.tmoco.bookshop.domain.store.Store;

public class Bookshop {
    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("Welcome to the Bookshop");
        System.out.println("============================");
        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress);
        System.out.println("Author: " + author);
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher =
                new Publisher("Tech Books Publishing Ltd.",
                        publisherAddress);
        System.out.println("Publisher: " + publisher);
        Book book1 = new Book("Java Unleashed",
                author, publisher, 15.95);
        System.out.println("Book: " + book1);
        System.out.println("\nCalculating the Sales Discount price");
        book1.setSaleDiscount(10.0);
        System.out.println("Sale price of book: " +
                book1.calculateSalePrice());
        Book book2 = new Book("Java For Professionals", author, publisher,
                12.55);
        System.out.println("\nBook2: " + book2);

        System.out.println("Book Instance Count: " + Book.getInstanceCount());


        Store store = new Store(new Book[]{book1, book2});

        for (Book book : store.getBooks()) {
            System.out.println("Book: " + book);
        }

        if (!store.isEmpty()) {
            Book book = store.get(0);
            book.setSaleDiscount(10.0);
            System.out.println("Sale price of book: " +
                    book1.calculateSalePrice());
            book.getAuthor().prettyPrint();
            book.getPublisher().prettyPrint();
        }

        if (store.size() > 1) {
            Sales salesProduct = store.get(1);
            salesProduct.setSaleDiscount(10.0);
            System.out.println("Sale price of book: " +
                    salesProduct.calculateSalePrice());
        }
    }
}
