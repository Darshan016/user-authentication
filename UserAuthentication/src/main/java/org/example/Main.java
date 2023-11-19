package org.example;

import org.example.service.UserAuthenticationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

            Scanner scanner=new Scanner(System.in);
            UserAuthenticationService userAuthenticationService=new UserAuthenticationService();
            System.out.println("enter username to register");
            String uname=scanner.nextLine();
            System.out.println("enter password");
            String pwd=scanner.nextLine();
            userAuthenticationService.registerUser(uname,pwd);

            System.out.println("enter ur name for auth");
            String name=scanner.nextLine();
            System.out.println("enter ur password");
            String password=scanner.nextLine();
            userAuthenticationService.authenticateUser(name,password);
            scanner.close();
    }
}