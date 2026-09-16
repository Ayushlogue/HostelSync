package com.hostelsync.service;

import com.hostelsync.model.Role;
import com.hostelsync.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public List<User> getUsersByRole(Role role) {
        List<User> result = new ArrayList<>();

        for (User user : users) {
            if (user.getRole() == role) {
                result.add(user);
            }
        }

        return result;
    }
}