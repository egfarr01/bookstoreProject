package com.example.bookstoreProject.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.bookstoreProject.entity.Author;
import com.example.bookstoreProject.entity.Book;
import com.example.bookstoreProject.service.BookService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("searchByISBN/{ISBN}")
    public ResponseEntity<Book> searchBooks(@PathVariable String ISBN){
        return ResponseEntity.ok(bookService.searchBooksByISBN(ISBN));
    }

    @GetMapping("/searchByAuthor/{authorId}")
    public ResponseEntity<List<Book>> searchBooks(@PathVariable Long authorId){
        return ResponseEntity.ok(bookService.searchBooksByAuthor(authorId));
    }
    
    @PostMapping("createBook/{authorId}")
    public Book createBook(@RequestBody Book book, @PathVariable Long authorId) {
        book.setAuthor(new Author(authorId));
        return bookService.createBook(book);
    }

}
