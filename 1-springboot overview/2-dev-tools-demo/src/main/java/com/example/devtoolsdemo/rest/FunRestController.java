package com.example.devtoolsdemo.rest;

import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String fun1(){
        return "Hello!";
    }

    @GetMapping("/fruits")
    public String fun2(){
        return "It's the jackfruit";
    }
}
