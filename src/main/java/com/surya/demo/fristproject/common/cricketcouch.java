package com.surya.demo.fristproject.common;

import org.springframework.stereotype.Component;

@Component
public class cricketcouch implements couch{
    @Override
    public String getWorkoutDally() {
        return "dally evining pratice for cricket";
    }
}
