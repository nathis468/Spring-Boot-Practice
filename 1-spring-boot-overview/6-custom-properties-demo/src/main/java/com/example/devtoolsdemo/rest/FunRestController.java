package com.example.devtoolsdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${student.name}")
    private String studentName;

    @Value("${teacher.name}")
    private String teacherName;

    @GetMapping("/")
    public String fun1(){
        return "Hello!";
    }

    @GetMapping("/clgdetails")
    public String fun2(){
        return "Student name:"+studentName+" "+"Teacher name:"+teacherName;
    }
}
