package org.example.model;

public class User {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
