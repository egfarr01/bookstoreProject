package com.example.bookstoreProject.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> searchCommentsByISBN(String query);

    List<Comment> sortCommentsByRating();

    Comment createComment(Comment comment);

    List<Comment> getCommentsAboveRating(int target);

    Double getAvgRatingDouble(String ISBN);

}
