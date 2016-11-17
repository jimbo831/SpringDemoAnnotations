package com.johnbwhitejr.springdemo.annotations.applications;

import com.johnbwhitejr.springdemo.annotations.coaches.Coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by johnwhite on 11/16/16.
 */

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
