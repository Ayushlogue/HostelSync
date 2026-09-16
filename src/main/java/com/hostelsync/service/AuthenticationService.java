package com.hostelsync.service;

import com.hostelsync.exception.AuthenticationException;
import com.hostelsync.model.User;
import com.hostelsync.util.PasswordUtil;

public class AuthenticationService {

    private final UserService userService;

    public AuthenticationService(UserService userService) {
        this.userService = userService;
    }

    public User login(String email, String password) {

        User user = userService.findByEmail(email);

        if (user == null) {
            throw new AuthenticationException("User not found.");
        }

        String hashedPassword = PasswordUtil.hashPassword(password);

        if (!user.getPassword().equals(hashedPassword)) {
            throw new AuthenticationException("Invalid password.");
        }

        return user;
    }
}