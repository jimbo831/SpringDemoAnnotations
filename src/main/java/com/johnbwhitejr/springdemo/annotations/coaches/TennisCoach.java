package com.johnbwhitejr.springdemo.annotations.coaches;

import com.johnbwhitejr.springdemo.annotations.fortunes.FortuneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by johnwhite on 11/16/16.
 */

@Component
public class TennisCoach implements Coach {

  @Autowired
  @Qualifier("randomFortuneService")
  private FortuneService fortuneService;

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println(">> TennisCoach: inside doMyStartupStuff");
  }

  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println(">> TennisCoach: inside doMyCleanupStuff");
  }
}
