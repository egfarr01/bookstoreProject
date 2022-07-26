package com.example.bookstoreProject.Comment;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
   //search comments by book
   @Query(value = "SELECT * from comments p WHERE " +
    "p.book.isbn LIKE :isbn", nativeQuery = true)
    List<Comment> searchCommentsByISBN(String isbn);
   //search comments by rating
   List<Comment> findByOrderByRatingDesc();
   //search comments by user
   @Query(value = "SELECT * from comments p WHERE " +
   "p.user.id LIKE :userID", nativeQuery = true)
   List<Comment> searchCommentsByUser(Long userID);

   List<Comment> findByRatingGreaterThanEqual(int target);

   @Query(value = "SELECT AVG(rating) from comments p WHERE " +
   "p.book_isbn LIKE :ISBN", nativeQuery = true)
   Double getAvgRatingDouble(String ISBN);

}
