package com.dp.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Subscriber {
  String message;
  public abstract void printMessage();
}
