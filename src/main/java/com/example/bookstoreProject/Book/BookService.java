package com.example.bookstoreProject.Book;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    List<Book> searchBooksByAuthor(Long authorId);
    Book searchBooksByISBN(String ISBN);
    Book createBook(Book book);
}
