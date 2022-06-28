package com.example.bookstoreProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreProject.entity.Book;

@Service
public interface BookService {
    List<Book> searchBooksByAuthor(Long authorId);
    Book searchBooksByISBN(String ISBN);
    Book createBook(Book book);
}
