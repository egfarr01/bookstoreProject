package com.example.bookstoreProject.Comment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Comment>> searchComment(@RequestParam("query") String query){
        return ResponseEntity.ok(commentService.searchComments(query));
    }

    @PostMapping
    public Comment createComments(@RequestBody Comment comment) {
        return commentService.createComments(comment);
    }

}
