package com.lm10.lld.pen.PenCodex.PenCodex.pen;

import com.lm10.lld.pen.PenCodex.PenCodex.capability.Refillable;
import com.lm10.lld.pen.PenCodex.PenCodex.feature.Feature;
import com.lm10.lld.pen.PenCodex.PenCodex.ink.RefillBasedInkContainer;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Refill;
import com.lm10.lld.pen.PenCodex.PenCodex.style.WritingStyle;
import java.util.List;

public abstract class RefillPen extends Pen implements Refillable {
  private final RefillBasedInkContainer refillContainer;

  protected RefillPen(
      PenMetadata metadata,
      Nib nib,
      WritingStyle writingStyle,
      Refill refill,
      List<Feature> features) {
    this(metadata, nib, writingStyle, new RefillBasedInkContainer(refill), features);
  }

  private RefillPen(
      PenMetadata metadata,
      Nib nib,
      WritingStyle writingStyle,
      RefillBasedInkContainer refillContainer,
      List<Feature> features) {
    super(metadata, nib, refillContainer, writingStyle, features);
    this.refillContainer = refillContainer;
  }

  @Override
  public void replaceRefill(Refill refill) {
    refillContainer.replaceRefill(refill);
  }
}
