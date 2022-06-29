package com.example.bookstoreProject.User;

import java.util.List;

public interface UserService {
    List<User> searchUsers(String query);

    User createUser(User user);
}
