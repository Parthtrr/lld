package com.lm10.lld.pen.PenCodex.PenCodex.pen;

import com.lm10.lld.pen.PenCodex.PenCodex.feature.Feature;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Refill;
import com.lm10.lld.pen.PenCodex.PenCodex.style.WritingStyle;
import java.util.List;

public class BallPen extends RefillPen {
  public BallPen(PenMetadata metadata, Nib nib, WritingStyle writingStyle, Refill refill) {
    this(metadata, nib, writingStyle, refill, List.of());
  }

  protected BallPen(
      PenMetadata metadata,
      Nib nib,
      WritingStyle writingStyle,
      Refill refill,
      List<Feature> features) {
    super(metadata, nib, writingStyle, refill, features);
  }

  @Override
  public String type() {
    return "Ball Pen";
  }
}
