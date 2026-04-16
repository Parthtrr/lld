package com.lm10.lld.pen.PenCodex.PenCodex.model;

import java.util.Objects;

public final class Refill {
  private final String brand;
  private final Ink ink;
  private final double capacity;
  private double remainingInk;

  public Refill(String brand, Ink ink, double capacity) {
    if (brand == null || brand.isBlank()) {
      throw new IllegalArgumentException("Refill brand cannot be blank");
    }
    if (capacity <= 0) {
      throw new IllegalArgumentException("Refill capacity must be positive");
    }
    this.brand = brand;
    this.ink = Objects.requireNonNull(ink, "Ink cannot be null");
    this.capacity = capacity;
    this.remainingInk = capacity;
  }

  public String getBrand() {
    return brand;
  }

  public Ink getInk() {
    return ink;
  }

  public double getCapacity() {
    return capacity;
  }

  public double getRemainingInk() {
    return remainingInk;
  }

  public boolean hasInk(double amount) {
    validateAmount(amount);
    return remainingInk >= amount;
  }

  public void consume(double amount) {
    validateAmount(amount);
    if (!hasInk(amount)) {
      throw new IllegalStateException("Refill does not have enough ink");
    }
    remainingInk -= amount;
  }

  private void validateAmount(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount must be positive");
    }
  }

  @Override
  public String toString() {
    return brand + " refill [" + ink + ", remaining=" + remainingInk + "/" + capacity + "]";
  }
}
