package com.lm10.lld.pen.PenCodex.PenCodex.style;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;

public interface WritingStyle {
  String name();

  double inkPerCharacter();

  String render(String text, Ink ink, Nib nib);

  default double estimateInkUsage(String text) {
    long characters = text.chars().filter(character -> !Character.isWhitespace(character)).count();
    return Math.max(1L, characters) * inkPerCharacter();
  }
}
