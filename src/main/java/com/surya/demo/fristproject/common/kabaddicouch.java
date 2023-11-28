package com.surya.demo.fristproject.common;

import org.springframework.stereotype.Component;

@Component
public class kabaddicouch implements couch{

    @Override
    public String getWorkoutDally() {
        return "dally pratices kabaddi";
    }
}
