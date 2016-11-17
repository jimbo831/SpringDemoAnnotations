package com.johnbwhitejr.springdemo.annotations.coaches;

import org.springframework.stereotype.Component;

/**
 * Created by johnwhite on 11/16/16.
 */

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
