package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "You must workout atleast for 15 minutes";
    }
}
