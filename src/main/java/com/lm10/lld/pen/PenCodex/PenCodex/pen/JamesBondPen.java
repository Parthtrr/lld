package com.lm10.lld.pen.PenCodex.PenCodex.pen;

import com.lm10.lld.pen.PenCodex.PenCodex.feature.CameraFeature;
import com.lm10.lld.pen.PenCodex.PenCodex.feature.MicrophoneFeature;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Refill;
import com.lm10.lld.pen.PenCodex.PenCodex.style.WritingStyle;
import java.util.List;

public class JamesBondPen extends BallPen {
  public JamesBondPen(PenMetadata metadata, Nib nib, WritingStyle writingStyle, Refill refill) {
    super(metadata, nib, writingStyle, refill, List.of(new CameraFeature(), new MicrophoneFeature()));
  }

  @Override
  public String type() {
    return "Spy Ball Pen";
  }
}
