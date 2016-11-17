package com.johnbwhitejr.springdemo.annotations.fortunes;

/**
 * Created by u6042420 on 11/17/2016.
 */

public class SadFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "Today is a sad day";
  }
}
