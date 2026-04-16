package com.lm10.lld.pen.pen1.pens;

import com.lm10.lld.pen.pen1.dto.Refill;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RefillPen extends ReusablePen {
  private Refill refill;
  public RefillPen(Refill refill) {
    super();
    this.refill = refill;
  }
}
