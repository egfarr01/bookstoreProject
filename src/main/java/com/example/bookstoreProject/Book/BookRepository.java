package com.example.bookstoreProject.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    @Query(value = "SELECT * from books p WHERE " +
    "p.author_id LIKE :authorid", nativeQuery = true)
    List<Book> searchBooksByAuthor(Long authorid);

    @Query(value = "SELECT * from books p WHERE " +
    "p.ISBN LIKE :isbn", nativeQuery = true)
    Book searchBooksByISBN(String isbn);

    @Query(value = "SELECT * from books p WHERE " +
    "p.genre LIKE :genre", nativeQuery = true)
    List<Book> searchBooksByGenre(String genre);

    List<Book> findTop10ByOrderByCopiesSoldDesc();

}