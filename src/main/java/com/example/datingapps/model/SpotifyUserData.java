package com.example.datingapps.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpotifyUserData {
//    @JsonIgnoreProperties
//    @JsonProperty("display_name")
    private String display_name;
//    @JsonProperty("email")
    private String email;

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
