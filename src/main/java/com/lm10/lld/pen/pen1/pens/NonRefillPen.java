package com.lm10.lld.pen.pen1.pens;

import com.lm10.lld.pen.pen1.dto.Ink;
import com.lm10.lld.pen.pen1.dto.Nib;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NonRefillPen extends ReusablePen {
  private Ink ink;
  private Nib nib;
  public NonRefillPen(Ink ink, Nib nib) {
    super();
    this.ink = ink;
    this.nib = nib;
  }
}
