package uk.co.bbc.tmoco.bookshop.domain.store;

import uk.co.bbc.tmoco.bookshop.domain.product.Book;

import java.util.Arrays;
import java.util.List;

public final class Store {
    private final List<Book> books;

    public Store(Book[] books) {
        this.books = Arrays.asList(books);
    }

    public Store() {
        this(new Book[]{});
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book get(int index) {
        return this.books.get(index);
    }

    public boolean isEmpty() {
        return this.books.isEmpty();
    }

    public int size() {
        return this.books.size();
    }
}
