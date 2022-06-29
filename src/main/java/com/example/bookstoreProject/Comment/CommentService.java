package com.example.bookstoreProject.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> searchComments(String query);

    Comment createComments(Comment comment);
}
