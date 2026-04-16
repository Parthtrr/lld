package com.lm10.lld.pen.pen1.pens;

import com.lm10.lld.pen.pen1.dto.Ink;
import com.lm10.lld.pen.pen1.dto.Nib;
import com.lm10.lld.pen.pen1.strategy.FastWritingStrategy;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NonReusablePen extends Pen {

  private Ink ink;
  private Nib nib;

  public NonReusablePen(Ink ink, Nib nib) {
    super();
    this.ink = ink;
    this.nib = nib;
    writingStrategy = new FastWritingStrategy();
  }
  @Override
  public void write() {
    writingStrategy.write();
  }
}
