package com.lm10.lld.pen.PenCodex.PenCodex.pen;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Refill;
import com.lm10.lld.pen.PenCodex.PenCodex.style.WritingStyle;

public class GelPen extends RefillPen {
  public GelPen(PenMetadata metadata, Nib nib, WritingStyle writingStyle, Refill refill) {
    super(metadata, nib, writingStyle, refill, java.util.List.of());
  }

  @Override
  public String type() {
    return "Gel Pen";
  }
}
