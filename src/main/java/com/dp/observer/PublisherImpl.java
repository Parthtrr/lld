package com.dp.observer;


import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class PublisherImpl implements Publisher {

  List<Subscriber> subscribers = new ArrayList<>();
  String message;
  @Override
  public void setMessage(String message) {
    this.message = message;
    notifyObservers();
  }
  @Override
  public void registerObserver(Subscriber observer) {
    subscribers.add(observer);
  }

  @Override
  public void removeObserver(Subscriber observer) {
    if(CollectionUtils.isEmpty(subscribers)) {
      throw new IllegalStateException("subscriber is empty");
    }
    subscribers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for(Subscriber subscriber : subscribers) {
      publish(message, subscriber);
    }
  }

  @Override
  public void publish(String message, Subscriber subscriber) {
    subscriber.setMessage(message);
  }
}
