package com.dp.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Background implements GraphicalObject {
  private int x;
  private int y;
  private int height;
  private int width;
  private String color;

  public Background(int i, int i1, int i2, int i3, int i4) {
  }

  @Override
  public Background clone() throws CloneNotSupportedException {
    Background background = new Background();
    background.x = x;
    background.y = y;
    background.height = height;
    background.width = width;
    background.color = color;
    return background;
  }
}
