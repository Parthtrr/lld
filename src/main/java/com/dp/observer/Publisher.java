package com.dp.observer;


public interface Publisher {
  void registerObserver(Subscriber subscriber);
  void removeObserver(Subscriber subscriber);
  void notifyObservers();
  void publish(String message, Subscriber subscriber);
  void setMessage(String message);
}
