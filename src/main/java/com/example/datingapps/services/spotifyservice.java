package com.example.datingapps.services;

import com.example.datingapps.model.SpotifyUserData;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.Media;
import java.io.DataInput;
import java.io.IOException;
import java.util.List;

public class spotifyservice {
    private static String token;

    public spotifyservice(String token) {
        spotifyservice.token = token;
    }

    public static boolean getUserSpotifyData(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBearerAuth(token);
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> request = new HttpEntity<>(httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange("https://api.spotify.com/v1/me", HttpMethod.GET, request, String.class);
        System.out.println(response.getBody());
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            SpotifyUserData spotifyUserData = objectMapper.readValue(response.getBody(), SpotifyUserData.class);
            fetchUserArtists(spotifyUserData.getDisplay_name(), request);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
//        https://api.spotify.com/v1/artists send get req fetchuserartist
    }

    public static void fetchUserArtists(String username, HttpEntity<Object> request){
        System.out.println(username);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange("https://api.spotify.com/v1/me/top/artists", HttpMethod.GET, request, String.class);
        System.out.println(response + "resp");
    }
}
