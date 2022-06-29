package com.example.bookstoreProject.Author;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    // @GetMapping("/search")
    // public ResponseEntity<List<Author>> searchAuthors(@RequestParam("query") String query){
    //     return ResponseEntity.ok(AuthorService.searchAuthors(query));
    // }

    @PostMapping
    @RequestMapping("/createAuthor")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

}