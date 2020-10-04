package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    String addUser(String name, String surname);

    User removeUser(long id);

    User getUser(long id);

}
