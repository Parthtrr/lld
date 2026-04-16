package com.lm10.lld.pen.PenCodex.PenCodex.feature;

public final class MicrophoneFeature implements Feature {
  @Override
  public String name() {
    return "Microphone";
  }

  @Override
  public String describe() {
    return "Records nearby audio";
  }
}
