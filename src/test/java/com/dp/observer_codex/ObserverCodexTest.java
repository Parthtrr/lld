package com.dp.observer_codex;

import org.junit.Assert;
import org.junit.Test;

public class ObserverCodexTest {

  @Test
  public void publishUpdateNotifiesAllObservers() {
    NewsPublisher publisher = new NewsPublisher();
    EmailSubscriber emailSubscriber = new EmailSubscriber("codex@example.com");
    MobileSubscriber mobileSubscriber = new MobileSubscriber("9999999999");

    publisher.addObserver(emailSubscriber);
    publisher.addObserver(mobileSubscriber);
    publisher.publishUpdate("Observer pattern implemented");

    Assert.assertEquals(
        "Email to codex@example.com: Observer pattern implemented",
        emailSubscriber.getLastMessage());
    Assert.assertEquals(
        "SMS to 9999999999: Observer pattern implemented",
        mobileSubscriber.getLastMessage());
  }

  @Test
  public void duplicateRegistrationDoesNotDuplicateNotification() {
    NewsPublisher publisher = new NewsPublisher();
    CountingObserver observer = new CountingObserver();

    publisher.addObserver(observer);
    publisher.addObserver(observer);
    publisher.publishUpdate("Single delivery only");

    Assert.assertEquals(1, observer.getUpdateCount());
    Assert.assertEquals("Single delivery only", observer.getLastMessage());
  }

  @Test
  public void removeObserverIsIdempotent() {
    NewsPublisher publisher = new NewsPublisher();
    CountingObserver observer = new CountingObserver();

    publisher.addObserver(observer);
    publisher.removeObserver(observer);
    publisher.removeObserver(observer);
    publisher.publishUpdate("No observer should receive this");

    Assert.assertEquals(0, observer.getUpdateCount());
  }

  private static final class CountingObserver implements Observer {
    private int updateCount;
    private String lastMessage = "";

    @Override
    public void update(String message) {
      updateCount++;
      lastMessage = message;
    }

    private int getUpdateCount() {
      return updateCount;
    }

    private String getLastMessage() {
      return lastMessage;
    }
  }
}
