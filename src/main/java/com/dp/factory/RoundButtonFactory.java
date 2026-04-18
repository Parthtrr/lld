package com.dp.factory;

public class RoundButtonFactory implements ButtonFactory {
  int radius;
  public RoundButtonFactory(int radius){
    this.radius = radius;
  }
  @Override
  public Button create() {
    return new RoundButton(this.radius);
  }
}
