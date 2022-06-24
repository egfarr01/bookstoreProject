package com.example.bookstoreProject.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bookstoreProject.entity.Author;
import com.example.bookstoreProject.repository.AuthorRepository;
import com.example.bookstoreProject.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;


    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }
}