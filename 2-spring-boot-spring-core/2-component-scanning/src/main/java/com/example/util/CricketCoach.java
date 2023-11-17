package com.example.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "This is the daily workout schedule !!";
    }
}
