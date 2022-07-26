// package com.example.bookstoreProject.WishList;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;


// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;

// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// import javax.persistence.ManyToOne;

// @Getter
// @Settertructor
// @AllArgs
// @NoArgsConsConstructor
// @Entity
// @Table(name = "wishlist")
// public class WishListMain {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String add;
//     private String remove;
    
//     @ManyToOne
//     User user;
//     @ManyToOne
//     Book book;

//     @CreationTimestamp
//     private LocalDateTime date_created;
//     @UpdateTimestamp
//    private LocalDateTime date_updated;

// }