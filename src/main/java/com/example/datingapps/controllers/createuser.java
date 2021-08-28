package com.example.datingapps.controllers;

//import com.example.datingapps.utils.jwtutil;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.core.userdetails.UserDetails;
import com.example.datingapps.api.AuthenticationRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.datingapps.utils.jwtutil;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

@RestController
public class createuser {
    private static final String token = "hello";
    @PostMapping("/postuserdetails")
//    change String userdata to classname objectname
    public static String addUserDetails(@RequestBody AuthenticationRequest userdata) {
        System.out.println("hi");
        return "okai";
    }

    @PostMapping("/user/postlogindetails")
    public static String postLoginDetails(@RequestBody AuthenticationRequest authenticationRequest){
        System.out.println(authenticationRequest.getUsername());
        return jwtutil.jwtToken(authenticationRequest.getUsername());
    }

    @PostMapping(value = "/image/upload")
    public static void uploadImage(@RequestParam("image")MultipartFile file, RedirectAttributes redirectAttributes) throws Exception{
        byte[] bytes = file.getBytes();
        System.out.println(file.getOriginalFilename() + " fie");
        try {
            File userimagefile = new File("/Users/prathamkrishna/Desktop/work/datingapps/src/main/resources/userimages/" + file.getOriginalFilename());
            Path path = Paths.get("/Users/prathamkrishna/Desktop/work/datingapps/src/main/resources/userimages/" + file.getOriginalFilename());
            userimagefile.createNewFile();
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
            System.out.println("hii");
        } catch (Exception e){
            System.out.println("Error" + e);
        }
    }
}
