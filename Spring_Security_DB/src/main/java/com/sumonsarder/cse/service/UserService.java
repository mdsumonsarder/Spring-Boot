package com.sumonsarder.cse.service;

import com.sumonsarder.cse.model.User;

public interface UserService {
    void addUser(User user);
    User getUserByEmail(String email);
}
