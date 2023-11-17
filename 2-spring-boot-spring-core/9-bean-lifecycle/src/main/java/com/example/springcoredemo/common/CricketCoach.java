package com.example.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "You must workout atleast for 15 minutes";
    }

    @PostConstruct
    public void StartupStuff(){
        System.out.println("Custom bean initialization of method : "+getClass().getSimpleName());
    }

    @PreDestroy
    public void CleanupStuff(){
        System.out.println("Custom bean destruction of method : "+getClass().getSimpleName());
    }

}
