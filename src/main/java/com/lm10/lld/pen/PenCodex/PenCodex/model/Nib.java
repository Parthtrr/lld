package com.lm10.lld.pen.PenCodex.PenCodex.model;

import java.util.Objects;

public final class Nib {
  private final double tipSizeMm;
  private final NibMaterial material;

  public Nib(double tipSizeMm, NibMaterial material) {
    if (tipSizeMm <= 0) {
      throw new IllegalArgumentException("Nib tip size must be positive");
    }
    this.tipSizeMm = tipSizeMm;
    this.material = Objects.requireNonNull(material, "Nib material cannot be null");
  }

  public double getTipSizeMm() {
    return tipSizeMm;
  }

  public NibMaterial getMaterial() {
    return material;
  }

  @Override
  public String toString() {
    return tipSizeMm + "mm " + material;
  }
}
