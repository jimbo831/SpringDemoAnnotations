package com.johnbwhitejr.springdemo.annotations.fortunes;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by johnwhite on 11/16/16.
 */

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private Random myRandom = ThreadLocalRandom.current();

    @Override
    public String getFortune() {
        return data[myRandom.nextInt(data.length)];
    }
}
