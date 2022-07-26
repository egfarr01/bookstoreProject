package com.example.bookstoreProject.Book;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    @Override
    public Page<Book> getBooksAtPageOfSize(int pageNumber, int pageSize) {
        Pageable customPage = PageRequest.of(pageNumber, pageSize, Sort.by("title"));
        return bookRepository.findAll(customPage);
    }

    
}
