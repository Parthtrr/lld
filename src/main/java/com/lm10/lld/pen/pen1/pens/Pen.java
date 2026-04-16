package com.lm10.lld.pen.pen1.pens;

import com.lm10.lld.pen.pen1.strategy.WritingStrategy;

public abstract class Pen {
  String body;
  String brand;
  double price;
  WritingStrategy writingStrategy;

  public abstract void write();
}
