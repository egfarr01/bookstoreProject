package com.example.bookstoreProject.ShoppingCart;

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

import com.example.bookstoreProject.Book.Book;
import com.example.bookstoreProject.User.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="isbn")
    public Book book;


    @CreationTimestamp
    private LocalDateTime date_created;
    @UpdateTimestamp
    private LocalDateTime date_updated;
}
