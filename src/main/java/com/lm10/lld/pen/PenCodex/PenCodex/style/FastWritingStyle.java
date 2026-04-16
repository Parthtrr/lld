package com.lm10.lld.pen.PenCodex.PenCodex.style;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;

public final class FastWritingStyle implements WritingStyle {
  @Override
  public String name() {
    return "Fast";
  }

  @Override
  public double inkPerCharacter() {
    return 0.8;
  }

  @Override
  public String render(String text, Ink ink, Nib nib) {
    return "Fast strokes in " + ink.getColor() + " using a " + nib + " nib: " + text;
  }
}
