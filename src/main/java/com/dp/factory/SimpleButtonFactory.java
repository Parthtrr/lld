package com.dp.factory;

public class SimpleButtonFactory {

  public Button create(String type) {
    return switch (type) {
      case "primary" -> new PrimaryButton(1);
      case "round" -> new RoundButton(1);
      default -> throw new IllegalArgumentException("Unknown button type: " + type);
    };
  }
}
