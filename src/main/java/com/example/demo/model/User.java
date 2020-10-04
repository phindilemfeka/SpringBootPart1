package com.example.demo.model;

public class User {
    private static long id;
    private static String name;
    private static String surname;

    public User(long id, String name, String surname){
        User.id = id;
        User.name = name;
        User.surname = surname;
    }

    public static long getId() {
        return id;
    }

    public void setId(long id) {
        User.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        User.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        User.surname = surname;
    }
}

