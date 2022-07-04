package com.example.bookstoreProject.CreditCard;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    private CreditCardRepository creditCardRepository;

    public CreditCardServiceImpl(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }
    @Override
    public CreditCard createCreditCard(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }
    @Override
    public List<CreditCard> searchCreditCardsByUser(Long authorId) {
        List<CreditCard> cards = creditCardRepository.searchCreditCardsByUser(authorId);
        return cards;
    }
}
