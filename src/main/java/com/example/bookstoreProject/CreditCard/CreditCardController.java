package com.example.bookstoreProject.CreditCard;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreProject.User.User;

@RestController
@RequestMapping("/api/v1/creditCards")
public class CreditCardController {
    private CreditCardService creditCardService;

    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @GetMapping("/searchByUser/{userID}")
    public ResponseEntity<List<CreditCard>> searchCreditCardsByUser(@PathVariable Long userID){
        return ResponseEntity.ok(creditCardService.searchCreditCardsByUser(userID));
    }

    @PostMapping("/createCreditCard/{userID}")
    public CreditCard createCreditCard(@RequestBody CreditCard creditCard, @PathVariable User userID) {
        creditCard.setUser(userID);
        return creditCardService.createCreditCard(creditCard);
    }

}