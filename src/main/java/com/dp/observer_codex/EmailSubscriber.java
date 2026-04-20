package com.dp.observer_codex;

public class EmailSubscriber implements Observer {
  private final String email;
  private String lastMessage = "";

  public EmailSubscriber(String email) {
    this.email = email;
  }

  @Override
  public void update(String message) {
    lastMessage = "Email to " + email + ": " + message;
  }

  public String getLastMessage() {
    return lastMessage;
  }
}
