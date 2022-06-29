package com.example.bookstoreProject.Book;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreProject.Author.Author;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;


    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> searchBooksByAuthor(Long authorId) {
        List<Book> books = bookRepository.searchBooksByAuthor(authorId);
        return books;
    }

    @Override
    public Book searchBooksByISBN(String ISBN) {
        Book book = bookRepository.searchBooksByISBN(ISBN);
        return book;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

}
