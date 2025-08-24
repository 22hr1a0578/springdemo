package com.mite.springconsdemo.rest;

import com.mite.springconsdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DemoController {
    private Coach myCoach;
    @Autowired
    //public void setMyCoach(Coach thecoach) {
      //  myCoach = thecoach;
 // public DemoController(@Qualifier("baseballCoach")Coach theCoach) {
   //     this.myCoach = theCoach;
    //}

    public void setMyCoach(@Qualifier("hockeyCoach")Coach theCoach) {
        this.myCoach = theCoach;
    }
    //public DemoController(Coach theCoach) {
      //      myCoach = theCoach;}

@GetMapping("/dailyworkout")
    public String getSimpleName()
{
    return myCoach.getDailyWorkout();
}
}
