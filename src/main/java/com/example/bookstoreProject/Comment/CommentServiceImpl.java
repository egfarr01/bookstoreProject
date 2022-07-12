package com.example.bookstoreProject.Comment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> searchCommentsByISBN(String isbn) {
        List<Comment> comments = commentRepository.searchCommentsByISBN(isbn);
        return comments;
    }

    @Override
    public List<Comment> sortCommentsByRating() {
        List<Comment> comments = commentRepository.findByOrderByRatingDesc();
        return comments;
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }
}