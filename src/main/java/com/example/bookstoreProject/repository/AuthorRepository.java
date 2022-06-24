package com.example.bookstoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bookstoreProject.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
    
}
