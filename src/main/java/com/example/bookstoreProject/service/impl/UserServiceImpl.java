package com.example.bookstoreProject.service.impl;

import com.example.bookstoreProject.entity.User;
import com.example.bookstoreProject.repository.UserRepository;
import com.example.bookstoreProject.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public List<User> searchUsers(String query) {
        List<User> users = userRepository.searchUsersSQL(query);
        return users;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}