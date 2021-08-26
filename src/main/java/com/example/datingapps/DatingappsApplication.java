package com.example.datingapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
//import com.example.datingapps.service.hashpassword;

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


    }

}
