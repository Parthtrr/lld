package com.dp.observer_codex;

public class MobileSubscriber implements Observer {
  private final String phoneNumber;
  private String lastMessage = "";

  public MobileSubscriber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public void update(String message) {
    lastMessage = "SMS to " + phoneNumber + ": " + message;
  }

  public String getLastMessage() {
    return lastMessage;
  }
}
