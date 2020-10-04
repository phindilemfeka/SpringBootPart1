package com.example.demo.service;

import com.example.demo.dao.FakeRepo;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final FakeRepo fakeRepo;

@Autowired
    public UserServiceImpl(@Qualifier("fakeRepo") FakeRepo fakeRepo){  //The @Qualifier annotation is used to resolve the autowiring conflict, when there
                                                                        // are multiple beans of same type.
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(String name, String surname) { // should call insertUser(id, name, surname), from FakeRepo and print to console
                                                        // '[name] entered', (generate/hardcode the id)

        System.out.println("Name entered: ");
        return fakeRepo.insertUser(576L,User.getName(),User.getSurname());

    }

    @Override
    public User removeUser(long id) { // should call deleteUser(id) from FakeRepo and print to console '[name] removed'
        System.out.println("Name removed");
        return fakeRepo.deleteUser(User.getId());
    }

    @Override
    public User getUser(long id) { // should call findUserById(id) from FakeRepo and print to console 'hello [name]'
                                    //[name] - replaced with actual name return from the FakeRepo
        System.out.println("Hello ");
        return fakeRepo.findUserById(User.getId());
    }
}



