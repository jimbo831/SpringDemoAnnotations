package com.johnbwhitejr.springdemo.annotations.config;

import com.johnbwhitejr.springdemo.annotations.coaches.Coach;
import com.johnbwhitejr.springdemo.annotations.coaches.SwimCoach;
import com.johnbwhitejr.springdemo.annotations.fortunes.FortuneService;
import com.johnbwhitejr.springdemo.annotations.fortunes.SadFortuneService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by u6042420 on 11/17/2016.
 */

@Configuration
//@ComponentScan("com.johnbwhitejr.springdemo.annotations")
public class SportConfig {

  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  @Bean
  public Coach swimCoach() {
    return new SwimCoach(sadFortuneService());
  }
}
