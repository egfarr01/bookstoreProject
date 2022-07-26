package com.example.bookstoreProject.Book;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreProject.Author.Author;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/searchByISBN/{ISBN}")
    public ResponseEntity<Book> searchBooksbyISBN(@PathVariable String ISBN){
        return ResponseEntity.ok(bookService.searchBooksByISBN(ISBN));
    }

    @GetMapping("/searchByAuthor/{authorId}")
    public ResponseEntity<List<Book>> searchBooksbyAuthor(@PathVariable Long authorId){
        return ResponseEntity.ok(bookService.searchBooksByAuthor(authorId));
    }
    
    @PostMapping("/createBook/{authorId}")
    public Book createBook(@RequestBody Book book, @PathVariable Author authorId) {
        book.setAuthor(authorId);
        return bookService.createBook(book);
    }

    @GetMapping("/searchByGenre/{genre}")
    public ResponseEntity<List<Book>> searchBooksbyGenre(@PathVariable String genre){
        return ResponseEntity.ok(bookService.searchBooksByGenre(genre));
    }

    @GetMapping("/getTopTen")
    public ResponseEntity<List<Book>> findTop10ByOrderByCopiesSoldDesc(){
        return ResponseEntity.ok(bookService.searchByTopTen());
    }

    @GetMapping("/browseBooks/{pageNumber}/{pageSize}")
    public ResponseEntity<Page<Book>> getBooksAtPageOfSize(@PathVariable int pageNumber, @PathVariable int pageSize) {
        return ResponseEntity.ok(bookService.getBooksAtPageOfSize(pageNumber, pageSize));
    }

  

}
