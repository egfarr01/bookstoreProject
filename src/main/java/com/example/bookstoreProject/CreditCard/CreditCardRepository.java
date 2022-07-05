package com.example.bookstoreProject.CreditCard;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
   //search credit cards by user
   @Query(value = "SELECT * from credit_cards p WHERE " +
   "p.user_id LIKE :userID", nativeQuery = true)
   List<CreditCard> searchCreditCardsByUser(Long userID);
}
