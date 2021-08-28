package com.example.datingapps.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class jwtutil {

    public static String jwtToken(String subject){
        //    encrypt the token and while passing here decrypt it
        Algorithm algorithm = Algorithm.HMAC256("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9".getBytes());
        String access_token = JWT.create()
                .withSubject(subject)
                .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                .withIssuer("Dating app")
                .sign(algorithm);
        System.out.println(access_token + "abc");
        return access_token;
    }


}
