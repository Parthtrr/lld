package com.lm10.lld.pen.PenCodex.PenCodex.pen;

import com.lm10.lld.pen.PenCodex.PenCodex.capability.InkFillable;
import com.lm10.lld.pen.PenCodex.PenCodex.ink.ReservoirInkContainer;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.style.WritingStyle;
import java.util.List;

public class FountainPen extends Pen implements InkFillable {
  private final ReservoirInkContainer reservoir;

  public FountainPen(
      PenMetadata metadata,
      Nib nib,
      WritingStyle writingStyle,
      Ink ink,
      double capacity,
      double initialInk) {
    this(metadata, nib, writingStyle, new ReservoirInkContainer(ink, capacity, initialInk));
  }

  private FountainPen(
      PenMetadata metadata,
      Nib nib,
      WritingStyle writingStyle,
      ReservoirInkContainer reservoir) {
    super(metadata, nib, reservoir, writingStyle, List.of());
    this.reservoir = reservoir;
  }

  @Override
  public void fillInk(Ink ink, double amount) {
    reservoir.fill(ink, amount);
  }

  @Override
  public String type() {
    return "Fountain Pen";
  }
}
