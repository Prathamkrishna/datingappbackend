package com.example.datingapps.services;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.Media;
import java.util.List;

public class spotifyservice {
    private static String token;

    public spotifyservice(String token) {
        this.token = token;
    }

    public static void getUserSpotifyData(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBearerAuth(token);
        System.out.println(token + "ni");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> request = new HttpEntity<>(httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange("https://api.spotify.com/v1/me", HttpMethod.GET, request, String.class);
        System.out.println(response);
//        https://api.spotify.com/v1/artists send get req
    }
}
