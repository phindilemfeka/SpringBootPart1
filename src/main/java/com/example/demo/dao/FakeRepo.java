package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {

    ArrayList<User> db = new ArrayList<User>();
    User user = new User(0,"","");

    @Override
    public String insertUser(long id, String name, String surname) { // should store the name, surname and id in the 'User' Object Array, return the name added
        db.add(new User(id,name,surname)) ;
        return name;
    }

    public User findUserById(long id) { // returns name and surname of the specified id from the 'User' Object Array, return the name
        for (User f:db){
            if (f.equals(User.getId())){
                System.out.println("found");
            }
        }
        return new User(0, User.getName(),user.getSurname());

    }

    @Override
    public User deleteUser(long id) { // returns name and surname of the specified id from the 'User' Object Array, return the name
        for (User d:db){
            if (d.equals(User.getId())){
                db.remove(id);
            }
        }
        return new User(0, User.getName(),user.getSurname());
    }
}

