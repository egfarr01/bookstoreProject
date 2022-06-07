package com.example.bookstoreProject.service;

import com.example.bookstoreProject.entity.User;

import java.util.List;

public interface UserService {
    List<User> searchUsers(String query);

    User createUser(User user);
}
