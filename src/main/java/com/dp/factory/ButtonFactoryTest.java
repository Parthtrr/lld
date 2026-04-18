package com.dp.factory;

import org.junit.Assert;
import org.junit.Test;

public class ButtonFactoryTest {
  @Test
  public void testCreateButton() {
    Button primary = new PriamryButtonFactory(1).create();
    Button round = new RoundButtonFactory(1).create();
    Assert.assertTrue(primary instanceof PrimaryButton);
    Assert.assertTrue(round instanceof RoundButton);
  }
}
