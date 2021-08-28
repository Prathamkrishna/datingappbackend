package com.example.datingapps;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.datingapps.utils.jwtutil;

import java.io.IOException;

@SpringBootApplication
public class DatingappsApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DatingappsApplication.class, args);
//        new test("random").addPath();
//        new test("random2").addPath();
//        new hashpassword().hashUserPassword("hello");
//        try {
//            File file = new File("/Users/prathamkrishna/Desktop/work/datingapps/src/main/java/" + "abc" + ".txt");
//            file.createNewFile();
//            Path path = Paths.get("/Users/prathamkrishna/Desktop/work/datingapps/src/main/java/abc.txt");
//            Files.write(path, Collections.singleton("meow"));
//            System.out.println("done");
//        } catch (Exception e){
//            System.out.println(e);
//        }
//        jwtutil.jwtToken("abc");
    }

//    CommandLineRunner run(Authentication authentication){
//        return args -> {
//            authentication.
//        };
//    }
}
