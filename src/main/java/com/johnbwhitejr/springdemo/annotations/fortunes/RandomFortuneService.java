package com.johnbwhitejr.springdemo.annotations.fortunes;

import org.springframework.stereotype.Component;

/**
 * Created by johnwhite on 11/16/16.
 */

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}
