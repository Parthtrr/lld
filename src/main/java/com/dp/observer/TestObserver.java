package com.dp.observer;

import org.junit.Test;

public class TestObserver {


  @Test
  public void test() {
    Subscriber subscriber = new SubscriberImpl1();
    Subscriber subscriber2 = new SubscriberImpl2();
    Publisher publisher = new PublisherImpl();
    publisher.registerObserver(subscriber);
    publisher.registerObserver(subscriber2);
    publisher.setMessage("Check");
    subscriber.printMessage();
    subscriber2.printMessage();
  }
}
