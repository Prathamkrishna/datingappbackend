package com.example.datingapps.services;

import org.springframework.stereotype.Service;

@Service
public class spotifytoken {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
