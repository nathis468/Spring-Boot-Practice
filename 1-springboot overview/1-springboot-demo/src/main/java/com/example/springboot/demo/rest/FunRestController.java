package com.example.springboot.demo.rest;

import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String fun1(){
        return "Hello!";
    }
}
