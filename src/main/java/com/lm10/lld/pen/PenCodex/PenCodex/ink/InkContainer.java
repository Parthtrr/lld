package com.lm10.lld.pen.PenCodex.PenCodex.ink;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;

public interface InkContainer {
  Ink currentInk();

  double remainingInk();

  boolean hasInk(double amount);

  void consume(double amount);

  String sourceType();
}
