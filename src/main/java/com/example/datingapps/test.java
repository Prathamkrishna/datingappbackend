package com.example.datingapps;

import java.util.Stack;

public class test {
    private static Stack<String> location = new Stack<>();
    test(String path){
        location.push(path);
    }
    public void addPath(){
        System.out.println(location);
    }
}
