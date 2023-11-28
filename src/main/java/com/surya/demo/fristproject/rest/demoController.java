package com.surya.demo.fristproject.rest;

import com.surya.demo.fristproject.common.couch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    private couch thecouch;
 @Autowired
    demoController(@Qualifier("footballcouch") couch thecouch){
        this.thecouch=thecouch;
    }
    @GetMapping("/workout")
    public String getWorkout(){
     return thecouch.getWorkoutDally();
    }

}
