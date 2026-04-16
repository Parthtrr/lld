package com.lm10.lld.pen.pen1.pens;

import com.lm10.lld.pen.pen1.strategy.SmoothWritingStrategy;

public class ReusablePen extends Pen {

  public ReusablePen() {
    super();
    writingStrategy = new SmoothWritingStrategy();
  }
  @Override
  public void write() {
    writingStrategy.write();
  }
}
