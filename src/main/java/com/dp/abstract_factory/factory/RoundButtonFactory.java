package com.dp.abstract_factory.factory;


import com.dp.abstract_factory.model.Button;
import com.dp.abstract_factory.model.RoundButton;

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
