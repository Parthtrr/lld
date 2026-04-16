package com.lm10.lld.pen.PenCodex.PenCodex.style;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;

public final class SmoothWritingStyle implements WritingStyle {
  @Override
  public String name() {
    return "Smooth";
  }

  @Override
  public double inkPerCharacter() {
    return 1.1;
  }

  @Override
  public String render(String text, Ink ink, Nib nib) {
    return "Smooth flow in " + ink.getColor() + " through a " + nib + " nib: " + text;
  }
}
