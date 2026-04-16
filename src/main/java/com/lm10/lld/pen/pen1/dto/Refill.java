package com.lm10.lld.pen.pen1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Refill {
  private String brand;
  private String type;
  private double price;
  private Ink ink;
  private Nib nib;
}
