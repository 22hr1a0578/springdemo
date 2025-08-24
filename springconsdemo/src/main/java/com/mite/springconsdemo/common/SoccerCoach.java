package com.mite.springconsdemo.common;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
    public SoccerCoach(){
        System.out.println("In constructor:" +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice Soccer";
    }
}