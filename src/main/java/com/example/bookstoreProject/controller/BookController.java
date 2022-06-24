package com.example.bookstoreProject.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreProject.entity.Author;
import com.example.bookstoreProject.entity.Book;
import com.example.bookstoreProject.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // @GetMapping("/search")
    // public ResponseEntity<List<Book>> searchBooks(@RequestParam("query") String query){
    //     return ResponseEntity.ok(bookService.searchBooks(query));
    // }

    @PostMapping
    public Book createBook(@RequestBody Book book, @RequestBody Author author) {
        return bookService.createBook(book, author);
    }

}
