package com.example.datingapps.api;

public class AuthenticationRequest{
    private static String username;
    private static int age;
    private static String email;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        AuthenticationRequest.username = username;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        AuthenticationRequest.age = age;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        AuthenticationRequest.email = email;
    }
}
