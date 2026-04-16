package com.lm10.lld.pen.PenCodex.PenCodex.pen;

import com.lm10.lld.pen.PenCodex.PenCodex.feature.Feature;
import com.lm10.lld.pen.PenCodex.PenCodex.ink.InkContainer;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Nib;
import com.lm10.lld.pen.PenCodex.PenCodex.model.PenMetadata;
import com.lm10.lld.pen.PenCodex.PenCodex.style.WritingStyle;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class Pen {
  private final PenMetadata metadata;
  private final Nib nib;
  private final InkContainer inkContainer;
  private final WritingStyle writingStyle;
  private final List<Feature> features;

  protected Pen(
      PenMetadata metadata,
      Nib nib,
      InkContainer inkContainer,
      WritingStyle writingStyle,
      List<Feature> features) {
    this.metadata = Objects.requireNonNull(metadata, "Metadata cannot be null");
    this.nib = Objects.requireNonNull(nib, "Nib cannot be null");
    this.inkContainer = Objects.requireNonNull(inkContainer, "Ink container cannot be null");
    this.writingStyle = Objects.requireNonNull(writingStyle, "Writing style cannot be null");
    this.features = List.copyOf(Objects.requireNonNull(features, "Features cannot be null"));
  }

  public abstract String type();

  public String write(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be blank");
    }

    double requiredInk = writingStyle.estimateInkUsage(text);
    if (!inkContainer.hasInk(requiredInk)) {
      throw new IllegalStateException(type() + " does not have enough ink to write");
    }

    Ink activeInk = inkContainer.currentInk();
    inkContainer.consume(requiredInk);
    return metadata.getBrand() + " " + metadata.getModel() + " [" + type() + "] -> "
        + writingStyle.render(text, activeInk, nib);
  }

  public String describe() {
    return metadata + ", type=" + type()
        + ", nib=" + nib
        + ", style=" + writingStyle.name()
        + ", inkSource=" + inkContainer.sourceType()
        + ", features=" + featureSummary()
        + ", remainingInk=" + inkContainer.remainingInk();
  }

  public String featureSummary() {
    if (features.isEmpty()) {
      return "none";
    }
    return features.stream().map(Feature::name).collect(Collectors.joining(", "));
  }

  public double remainingInk() {
    return inkContainer.remainingInk();
  }

  public PenMetadata getMetadata() {
    return metadata;
  }

  public Nib getNib() {
    return nib;
  }

  public WritingStyle getWritingStyle() {
    return writingStyle;
  }

  public List<Feature> getFeatures() {
    return features;
  }
}
