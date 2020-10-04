package com.example.demo.dao;

import com.example.demo.model.User;

public interface FakeRepoInterface {
    String insertUser(long id, String name, String surname);

    User findUserById(long id);

    User deleteUser(long id);


}
