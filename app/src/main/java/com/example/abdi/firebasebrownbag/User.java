package com.example.abdi.firebasebrownbag;

public class User {
    public String email;
    public String name;
    public String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.name = address;
    }

    public User() {
    }

    public User(String name, String email, String address) {
        this.email = email;
        this.name = name;
        this.address = address;
    }
}