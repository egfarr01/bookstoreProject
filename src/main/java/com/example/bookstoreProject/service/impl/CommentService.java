package com.example.bookstoreProject.service.impl;

import java.util.List;

import com.example.bookstoreProject.entity.Comment;

public interface CommentService {
    List<Comment> searchComments(String query);

    Comment createComments(Comment comment);
}
