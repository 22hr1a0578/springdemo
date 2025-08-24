package com.mite.springconsdemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
    @Component
    @Primary
    public class BaseballCoach implements Coach {
        @Override
        public String getDailyWorkout(){
            return "practice BaseBall well";
        }
    }


