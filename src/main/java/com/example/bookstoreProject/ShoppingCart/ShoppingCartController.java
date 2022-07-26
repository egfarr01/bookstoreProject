package com.example.bookstoreProject.ShoppingCart;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreProject.Author.Author;
import com.example.bookstoreProject.Book.Book;
import com.example.bookstoreProject.User.User;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/shoppingCarts")
public class ShoppingCartController {
    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/searchByUser/{userId}")
    public ResponseEntity<List<ShoppingCart>> searchShoppingCartsbyUser(@PathVariable Long userId){
        return ResponseEntity.ok(shoppingCartService.searchCartsByUser(userId));
    }
    
    @PostMapping("/createShoppingCart/{userId}/{bookId}")
    public ShoppingCart createShoppingCart(@RequestBody ShoppingCart shoppingCart, @PathVariable User userId, @PathVariable Book bookId) {
        shoppingCart.setUser(userId);
        shoppingCart.setBook(bookId);
        return shoppingCartService.createShoppingCart(shoppingCart);
    }

    @PostMapping("/updateShoppingCart/{userId}/{bookId}")
    public ShoppingCart updateShoppingCart(@RequestBody ShoppingCart shoppingCart, @PathVariable User userId, @PathVariable Book bookId) {
        shoppingCart.setUser(userId);
        shoppingCart.setBook(bookId);
        return shoppingCartService.createShoppingCart(shoppingCart);
    }
}
