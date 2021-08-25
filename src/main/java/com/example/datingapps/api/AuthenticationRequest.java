package com.example.datingapps.api;

public class AuthenticationRequest{
    private static String username;
    private static String password;

    public static byte[] getBytes() {
        return bytes;
    }

    public static void setBytes(byte[] bytes) {
        AuthenticationRequest.bytes = bytes;
    }

    private static byte[] bytes;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
