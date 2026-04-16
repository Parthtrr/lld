package com.lm10.lld.pen.pen1.pens;

import com.lm10.lld.pen.pen1.dto.Refill;
import com.lm10.lld.pen.pen1.strategy.Spyware;

public class JamesBondPen extends BallPen implements Spyware {
  public JamesBondPen(Refill refill) {
    super(refill);
  }

  @Override
  public boolean hasMic() {
    return true;
  }

  @Override
  public boolean hasCamera() {
    return true;
  }
}
