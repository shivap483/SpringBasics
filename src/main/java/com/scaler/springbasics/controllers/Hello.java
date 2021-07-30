package com.scaler.springbasics.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/hello")
public class Hello {
    @GetMapping("/greet")
    HelloObject greet(){
        return new HelloObject("Hello","good Morning");
    }
    @GetMapping("/world")
    String getHello(){
        return "Hello world";
    }
    @GetMapping("")
    String getHelloWord(){
        return "hello";
    }

}
