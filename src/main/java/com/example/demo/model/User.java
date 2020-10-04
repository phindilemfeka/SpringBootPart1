package com.example.demo.model;

public class User {
    private long id;
    private String name;
    private String surname;

    public User(long id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public static long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

