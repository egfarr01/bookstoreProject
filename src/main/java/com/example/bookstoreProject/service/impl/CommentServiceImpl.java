package com.example.bookstoreProject.service.impl;

import com.example.bookstoreProject.entity.Comment;
import com.example.bookstoreProject.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;


    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    @Override
    public List<Comment> searchComments(String query) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Comment createComments(Comment comment) {
        // TODO Auto-generated method stub
        return null;
    }
}