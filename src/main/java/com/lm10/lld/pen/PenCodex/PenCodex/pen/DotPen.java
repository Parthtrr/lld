package com.lm10.lld.pen.PenCodex.PenCodex.pen;

import com.lm10.lld.pen.PenCodex.PenCodex.ink.DisposableInkUnit;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.style.WritingStyle;
import java.util.List;

public class DotPen extends Pen {
  public DotPen(
      PenMetadata metadata,
      Nib nib,
      WritingStyle writingStyle,
      Ink ink,
      double initialInk) {
    super(metadata, nib, new DisposableInkUnit(ink, initialInk), writingStyle, List.of());
  }

  @Override
  public String type() {
    return "Dot Pen";
  }
}
