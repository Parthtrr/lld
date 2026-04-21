package com.dp.strategy;

public class BikeStrategy implements NavigationStrategy {
  @Override
  public void navigate(String destination, String source) {
    System.out.println("Bike strategy got navigated to destination: " + destination + " and source: " + source);
  }
}
