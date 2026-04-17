package com.dp.prototype;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {
  private Map<String,GraphicalObject> map = new HashMap<>();

  public void addPrototype(String type,GraphicalObject graphicalObject) {
    map.put(type, graphicalObject);
  }
  public GraphicalObject getPrototype(String type) {
    return map.get(type);
  }
}
