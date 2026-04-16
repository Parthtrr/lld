package com.lm10.lld.pen.PenCodex.PenCodex.model;

import java.util.Objects;

public final class PenMetadata {
  private final String brand;
  private final String model;
  private final BodyMaterial bodyMaterial;
  private final double price;

  public PenMetadata(String brand, String model, BodyMaterial bodyMaterial, double price) {
    if (brand == null || brand.isBlank()) {
      throw new IllegalArgumentException("Brand cannot be blank");
    }
    if (model == null || model.isBlank()) {
      throw new IllegalArgumentException("Model cannot be blank");
    }
    if (price < 0) {
      throw new IllegalArgumentException("Price cannot be negative");
    }
    this.brand = brand;
    this.model = model;
    this.bodyMaterial = Objects.requireNonNull(bodyMaterial, "Body material cannot be null");
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public BodyMaterial getBodyMaterial() {
    return bodyMaterial;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return brand + " " + model + " [" + bodyMaterial + ", Rs." + price + "]";
  }
}
