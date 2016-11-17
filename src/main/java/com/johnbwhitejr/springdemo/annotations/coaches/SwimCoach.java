package com.johnbwhitejr.springdemo.annotations.coaches;

import com.johnbwhitejr.springdemo.annotations.fortunes.FortuneService;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by u6042420 on 11/17/2016.
 */

public class SwimCoach implements Coach {

  private FortuneService fortuneService;

  @Value("${foo.email}")
  private String email;

  @Value("${foo.team}")
  private String team;

  public SwimCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Swim 1000 meters as a warm up.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  public String getEmail() {
    return email;
  }

  public String getTeam() {
    return team;
  }
}
