package com.johnbwhitejr.springdemo.annotations.applications;

import com.johnbwhitejr.springdemo.annotations.coaches.Coach;
import com.johnbwhitejr.springdemo.annotations.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by johnwhite on 11/16/16.
 */

public class JavaConfigDemoApp {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

    Coach theCoach = context.getBean("tennisCoach", Coach.class);

    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());

    context.close();
  }
}
