package com.thomasvitale.library;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class BookService {

    private static Map<Long, Book> bookRepository = new ConcurrentHashMap<>();

    static {
        bookRepository.put(1L, new Book(1L, "Harry Potter"));
        bookRepository.put(2L, new Book(2L, "The Lord of The Rings"));
        bookRepository.put(3L, new Book(3L, "The Golden Compass"));
    }

    List<Book> getBooks() {
        return new ArrayList<>(bookRepository.values());
    }

    Book getBookById(Long id) {
        return bookRepository.get(id);
    }
}
