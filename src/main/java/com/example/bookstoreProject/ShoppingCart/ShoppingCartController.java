package com.example.bookstoreProject.ShoppingCart;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
    @PostMapping("/createShoppingCart/{userId}/{isbn}")
    public ShoppingCart createShoppingCart(@RequestBody ShoppingCart shoppingCart, @PathVariable User userId, @PathVariable Book isbn) {
        shoppingCart.setUser(userId);
        shoppingCart.setBook(isbn);
        return shoppingCartService.createShoppingCart(shoppingCart);
    }

    @PostMapping("/updateShoppingCart/{userId}/{isbn}")
    public ShoppingCart updateShoppingCart(@RequestBody ShoppingCart shoppingCart, @PathVariable User userId, @PathVariable Book isbn) {
        shoppingCart.setUser(userId);
        shoppingCart.setBook(isbn);
        return shoppingCartService.createShoppingCart(shoppingCart);
    }

    @DeleteMapping("/deleteFromCart/{cartId}")
    public ResponseEntity<String> deleteFromCart(@PathVariable Long cartId) {
        return ResponseEntity.ok(shoppingCartService.deleteFromCart(cartId));
    }
}
