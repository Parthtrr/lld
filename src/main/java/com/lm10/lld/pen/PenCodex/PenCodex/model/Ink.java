package com.lm10.lld.pen.PenCodex.PenCodex.model;

import java.util.Objects;

public final class Ink {
  private final String color;
  private final InkType type;

  public Ink(String color, InkType type) {
    if (color == null || color.isBlank()) {
      throw new IllegalArgumentException("Ink color cannot be blank");
    }
    this.color = color;
    this.type = Objects.requireNonNull(type, "Ink type cannot be null");
  }

  public String getColor() {
    return color;
  }

  public InkType getType() {
    return type;
  }

  @Override
  public String toString() {
    return color + " " + type;
  }
}
