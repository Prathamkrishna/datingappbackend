package com.example.datingapps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.datingapps.services.spotifyservice;
import com.example.datingapps.services.spotifytoken;

@RestController
public class userspotifyaccesstoken {

    @PostMapping("/user/spotify/token")
    protected void getUserSpotifyToken(@RequestBody spotifytoken token){
        spotifyservice spotifyApiResponse = new spotifyservice(token.getToken());
        spotifyservice.getUserSpotifyData();
        System.out.println(spotifyApiResponse);
    }
}
