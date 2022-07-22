package com.example.bookstoreProject.ShoppingCart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{
    @Query(value = "SELECT * from shopping_cart p WHERE " +
    "p.user_id LIKE :userid", nativeQuery = true)
    List<ShoppingCart> searchCartsByUser(Long userid);
}
