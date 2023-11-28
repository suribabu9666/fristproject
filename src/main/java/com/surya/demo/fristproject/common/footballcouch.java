package com.surya.demo.fristproject.common;

import org.springframework.stereotype.Component;

@Component
public class footballcouch implements couch{
    @Override
    public String getWorkoutDally() {
        return "dally runing 5k";
    }
}
