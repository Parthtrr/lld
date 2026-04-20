package com.dp.observer_codex;

public interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
}
