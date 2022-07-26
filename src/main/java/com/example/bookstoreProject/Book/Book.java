package com.example.bookstoreProject.Book;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.bookstoreProject.Author.Author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    private String isbn;
    private String title;
    private String description;
    private String price;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="author_id")
    private Author author;

    private String genre;
    private int year_published;
    private long copiesSold;

    @CreationTimestamp
    private LocalDateTime date_created;
    @UpdateTimestamp
    private LocalDateTime date_updated;

    public Book(String isbn) {
        this.isbn = isbn;
    }
}
