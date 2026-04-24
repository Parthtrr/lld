package com.dp.prototype;



public class GameFactory {
  public GraphicalObject getPrototype(String type) {
    if(type.equals("game1")) {
      return new Background();
    }
    else if(type.equals("game2")) {
      return new Foreground();
    }
    throw new IllegalArgumentException("Unsupported type");
  }
}
