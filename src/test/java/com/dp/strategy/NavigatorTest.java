package com.dp.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class NavigatorTest {

  Navigator navigator;

  @Before
  public void setUp() {
    navigator = new Navigator(new CarStrategy());
  }

  @Test
  public void testCarStrategy() {
    navigator.navigate("Delhi", "Kanpur");
  }


  @Test
  public void testBikeStrategy() {
    navigator.setNavigationStrategy(new BikeStrategy());
    navigator.navigate( "Kanpur", "Delhi");
  }
}
