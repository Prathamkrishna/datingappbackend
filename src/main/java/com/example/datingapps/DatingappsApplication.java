package com.example.datingapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
//import com.example.datingapps.service.hashpassword;

@SpringBootApplication
public class DatingappsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatingappsApplication.class, args);
//        new test("random").addPath();
//        new test("random2").addPath();
//        new hashpassword().hashUserPassword("hello");
    }

}
