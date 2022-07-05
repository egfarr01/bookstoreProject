package com.example.bookstoreProject.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query(value = "SELECT * from users p WHERE " +
    "p.user_name LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    List<User> searchUsersSQL(String query);
}
