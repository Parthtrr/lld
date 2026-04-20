package com.dp.observer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
@Component
public class SubscriberImpl2 extends Subscriber {
  @Override
  public void printMessage() {
    System.out.println(message+" Second");
  }
}
