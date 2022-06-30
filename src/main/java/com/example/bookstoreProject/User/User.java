package com.example.bookstoreProject.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.bookstoreProject.PasswordValidator.ValidPassword;

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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String user_name;
    @NotEmpty
    @ValidPassword(message = "Password must be between 6 and 30 characters, " +
                             "contain at least one digit, " +
                             "and have no whitespace chars")
    private String password;
    private String first_name;
    private String last_name;
    @NotEmpty
    @Email
    private String email;
    private String home_address;
    @CreationTimestamp
    private LocalDateTime date_created;
    @UpdateTimestamp
    private LocalDateTime date_updated;

    public User(Long id) {
        this.id = id;
    }
}

