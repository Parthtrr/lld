package com.lm10.lld.pen.pen1.pens;

import com.lm10.lld.pen.pen1.dto.Ink;
import com.lm10.lld.pen.pen1.dto.Nib;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DotPen extends NonReusablePen {
  public DotPen(Ink ink, Nib nib) {
    super(ink,nib);
  }
}
