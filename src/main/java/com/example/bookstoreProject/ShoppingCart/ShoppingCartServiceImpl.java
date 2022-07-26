package com.example.bookstoreProject.ShoppingCart;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private ShoppingCartRepository shoppingCartRepository;


    public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }


    @Override
    public List<ShoppingCart> searchCartsByUser(Long userId) {
        List<ShoppingCart> shoppingCart = shoppingCartRepository.searchCartsByUser(userId);
        return shoppingCart;
    }

    @Override
    public ShoppingCart createShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public String deleteFromCart(Long id) {
        shoppingCartRepository.deleteById(id);
        return("Item id: " + id + " was removed from the cart.");
    }


}

