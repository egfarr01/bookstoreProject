package com.example.bookstoreProject.CreditCard;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CreditCardService {
    List<CreditCard> searchCreditCardsByUser(Long userID);
    CreditCard createCreditCard(CreditCard creditCard);


}
