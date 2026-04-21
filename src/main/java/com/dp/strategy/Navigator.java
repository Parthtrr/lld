package com.dp.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Navigator {
  private NavigationStrategy navigationStrategy;

  public void navigate(String destination, String source) {
    navigationStrategy.navigate(destination, source);
  }
}
