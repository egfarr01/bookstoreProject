package com.example.bookstoreProject.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreProject.User.User;

import org.springframework.data.jpa.repository.Query;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
   //search comments by book
   @Query(value = "SELECT * from comments p WHERE " +
    "p.book.isbn LIKE :isbn", nativeQuery = true)
    List<Comment> searchCommentsByISBN(String isbn);
   //search comments by rating
   List<Comment> findByOrderByRatingAsc();
   //search comments by user
   @Query(value = "SELECT * from comments p WHERE " +
   "p.user.id LIKE :userID", nativeQuery = true)
   List<Comment> searchCommentsByUser(Long userID);
}
