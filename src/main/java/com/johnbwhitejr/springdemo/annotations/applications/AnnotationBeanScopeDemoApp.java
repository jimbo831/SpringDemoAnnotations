package com.johnbwhitejr.springdemo.annotations.applications;

import com.johnbwhitejr.springdemo.annotations.coaches.Coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by u6042420 on 11/17/2016.
 */

public class AnnotationBeanScopeDemoApp {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Coach theCoach = context.getBean("tennisCoach", Coach.class);
    Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

    boolean result = theCoach == alphaCoach;

    System.out.println("Pointing to the same object: " + result);
    System.out.println("Memory location for theCoach: " + theCoach);
    System.out.println("Memory location for alphaCoach: " + alphaCoach);

    context.close();
  }
}
