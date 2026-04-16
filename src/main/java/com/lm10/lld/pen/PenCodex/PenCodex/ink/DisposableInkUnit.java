package com.lm10.lld.pen.PenCodex.PenCodex.ink;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import java.util.Objects;

public final class DisposableInkUnit implements InkContainer {
  private final Ink ink;
  private double remainingInk;

  public DisposableInkUnit(Ink ink, double initialInk) {
    if (initialInk <= 0) {
      throw new IllegalArgumentException("Initial ink must be positive");
    }
    this.ink = Objects.requireNonNull(ink, "Ink cannot be null");
    this.remainingInk = initialInk;
  }

  @Override
  public Ink currentInk() {
    return ink;
  }

  @Override
  public double remainingInk() {
    return remainingInk;
  }

  @Override
  public boolean hasInk(double amount) {
    validateAmount(amount);
    return remainingInk >= amount;
  }

  @Override
  public void consume(double amount) {
    validateAmount(amount);
    if (!hasInk(amount)) {
      throw new IllegalStateException("Disposable pen is out of ink");
    }
    remainingInk -= amount;
  }

  @Override
  public String sourceType() {
    return "sealed disposable reservoir";
  }

  private void validateAmount(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be positive");
    }
  }
}
