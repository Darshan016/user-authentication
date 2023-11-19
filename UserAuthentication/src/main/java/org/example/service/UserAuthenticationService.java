package org.example.service;

import org.example.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserAuthenticationService {
    private Map<String, User> user=new HashMap<>();

    public void registerUser(String userName,String password){
        if(!user.containsKey(userName)){
            User user1=new User(userName,password);
            user.put(userName,user1);
            System.out.println("User registered successfully");
        }else{
            System.out.println("user already exists");
        }
    }

    public boolean authenticateUser(String userName,String password) {
        if (user.containsKey(userName)) {
            User user1 = user.get(userName);
            if (user1.getPassword().equals(password)) {
                System.out.println("Authentication Successfull");
                return true;
            }
        }
        System.out.println("Invalid Credentials");
        return false;

    }

}
