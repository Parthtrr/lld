package com.dp.observer_codex;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class NewsPublisher implements Subject {
  private final Set<Observer> observers = new LinkedHashSet<>();
  private String latestMessage;

  @Override
  public void addObserver(Observer observer) {
    observers.add(Objects.requireNonNull(observer, "observer cannot be null"));
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void publishUpdate(String message) {
    latestMessage = Objects.requireNonNull(message, "message cannot be null");
    notifyObservers();
  }

  public String getLatestMessage() {
    return latestMessage;
  }

  private void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(latestMessage);
    }
  }
}
