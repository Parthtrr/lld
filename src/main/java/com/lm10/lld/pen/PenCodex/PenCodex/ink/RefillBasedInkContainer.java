package com.lm10.lld.pen.PenCodex.PenCodex.ink;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import com.lm10.lld.pen.PenCodex.PenCodex.model.Refill;
import java.util.Objects;

public final class RefillBasedInkContainer implements InkContainer {
  private Refill refill;

  public RefillBasedInkContainer(Refill refill) {
    this.refill = Objects.requireNonNull(refill, "Refill cannot be null");
  }

  public void replaceRefill(Refill refill) {
    this.refill = Objects.requireNonNull(refill, "Refill cannot be null");
  }

  @Override
  public Ink currentInk() {
    return refill.getInk();
  }

  @Override
  public double remainingInk() {
    return refill.getRemainingInk();
  }

  @Override
  public boolean hasInk(double amount) {
    return refill.hasInk(amount);
  }

  @Override
  public void consume(double amount) {
    refill.consume(amount);
  }

  @Override
  public String sourceType() {
    return "replaceable refill";
  }
}
