package com.lm10.lld.pen.PenCodex.PenCodex.ink;

import com.lm10.lld.pen.PenCodex.PenCodex.model.Ink;
import java.util.Objects;

public final class ReservoirInkContainer implements InkContainer {
  private Ink ink;
  private final double capacity;
  private double remainingInk;

  public ReservoirInkContainer(Ink ink, double capacity, double initialInk) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("Capacity must be positive");
    }
    if (initialInk <= 0 || initialInk > capacity) {
      throw new IllegalArgumentException("Initial ink must be between 0 and capacity");
    }
    this.ink = Objects.requireNonNull(ink, "Ink cannot be null");
    this.capacity = capacity;
    this.remainingInk = initialInk;
  }

  public void fill(Ink newInk, double amount) {
    Objects.requireNonNull(newInk, "Ink cannot be null");
    if (amount <= 0) {
      throw new IllegalArgumentException("Fill amount must be positive");
    }
    if (remainingInk > 0 && !isSameInk(newInk)) {
      throw new IllegalStateException("Cannot mix different inks in a partially filled reservoir");
    }
    if (remainingInk + amount > capacity) {
      throw new IllegalStateException("Fill amount exceeds reservoir capacity");
    }
    ink = newInk;
    remainingInk += amount;
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
      throw new IllegalStateException("Reservoir does not have enough ink");
    }
    remainingInk -= amount;
  }

  @Override
  public String sourceType() {
    return "fillable ink reservoir";
  }

  private boolean isSameInk(Ink other) {
    return ink.getType() == other.getType() && ink.getColor().equalsIgnoreCase(other.getColor());
  }

  private void validateAmount(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be positive");
    }
  }
}
