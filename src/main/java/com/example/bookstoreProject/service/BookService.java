package com.example.bookstoreProject.service;

import org.springframework.stereotype.Service;

import com.example.bookstoreProject.entity.Author;
import com.example.bookstoreProject.entity.Book;

@Service
public interface BookService {
    Book createBook(Book book, Author author);
}
