package com.example.bookstoreProject.Book;
import java.util.List;

import org.springframework.stereotype.Service;

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
    public Book searchBooksByISBN(String isbn) {
        Book book = bookRepository.searchBooksByISBN(isbn);
        return book;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> searchBooksByGenre(String genre) {
        List<Book> books = bookRepository.searchBooksByGenre(genre);
        return books;
    }

    @Override
    public List<Book> searchByTopTen() {
        List<Book> books = bookRepository.findTop10ByOrderByCopiesSoldDesc();
        return books;
    }
}
