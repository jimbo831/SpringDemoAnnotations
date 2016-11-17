package com.johnbwhitejr.springdemo.annotations.applications;

import com.johnbwhitejr.springdemo.annotations.coaches.SwimCoach;
import com.johnbwhitejr.springdemo.annotations.config.SportConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by johnwhite on 11/16/16.
 */

public class SwimJavaConfigDemoApp {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());
    System.out.println("Email: " + theCoach.getEmail());
    System.out.println("Team: " + theCoach.getTeam());

    context.close();
  }
}
