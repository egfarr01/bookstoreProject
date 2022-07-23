package com.example.bookstoreProject.Comment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreProject.Book.Book;
import com.example.bookstoreProject.User.User;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/searchByISBN")
    public ResponseEntity<List<Comment>> searchCommentsByISBN(@RequestParam("query") String query){
        return ResponseEntity.ok(commentService.searchCommentsByISBN(query));
    }

    @PostMapping("/createComment/{userID}/{ISBN}")
    public Comment createComments(@RequestBody Comment comment, @PathVariable Long userID, @PathVariable String ISBN) {
        comment.setUser(new User(userID));
        comment.setBook(new Book(ISBN));
        return commentService.createComment(comment);
    }

    @GetMapping("/RatingDescending")
    public ResponseEntity<List<Comment>> sortCommentsByRating() {
        return ResponseEntity.ok(commentService.sortCommentsByRating());
    }

    @GetMapping("/searchByRating/{target}")
    public ResponseEntity<List<Comment>> searchbyRating(@PathVariable int target){
        return ResponseEntity.ok(commentService.getCommentsAboveRating(target));
    }
}
