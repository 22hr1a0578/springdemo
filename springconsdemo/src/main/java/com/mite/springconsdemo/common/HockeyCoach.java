package com.mite.springconsdemo.common;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
    public HockeyCoach(){
        System.out.println("in constructor:" +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice Hockey";
    }
}