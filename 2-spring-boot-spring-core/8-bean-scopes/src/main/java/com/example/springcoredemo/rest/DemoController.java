package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach myNextCoach;
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach,@Qualifier("cricketCoach") Coach theNextCoach){
        this.myCoach=theCoach;
        this.myNextCoach=theNextCoach;
    }
    @GetMapping("/check")
    public String check(){
        return "Whether there is same instance used for multiple injection : "+(myCoach==myNextCoach);
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}