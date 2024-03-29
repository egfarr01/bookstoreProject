package com.example.bookstoreProject.ShoppingCart;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface ShoppingCartService {
    List<ShoppingCart> searchCartsByUser(Long userId);
    ShoppingCart createShoppingCart(ShoppingCart shoppingCart);
    String deleteFromCart(Long id);
    // Long deleteById(Long id);
 
}
