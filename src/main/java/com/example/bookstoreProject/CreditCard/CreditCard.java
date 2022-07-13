package com.example.bookstoreProject.CreditCard;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;
import com.example.bookstoreProject.User.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credit_cards")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    User user;
    @Length(min = 8, max = 19)
    private String card_number;

    @Length(min = 5, max = 5)
    private String zip_code;
    
    @Length(min = 3, max = 4)
    private String cvv;
    
    
    @CreationTimestamp
    private LocalDateTime date_created;
    @UpdateTimestamp
    private LocalDateTime date_updated;
}