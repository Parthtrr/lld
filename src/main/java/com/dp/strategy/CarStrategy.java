package com.dp.strategy;

public class CarStrategy implements NavigationStrategy {
  @Override
  public void navigate(String destination, String source) {
    System.out.println("Car strategy got navigated to destination: " + destination + " and source: " + source);
  }
}
