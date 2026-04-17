package com.dp.prototype;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {
  @Test
  public void test() throws CloneNotSupportedException {
    Background background = new Background(1,2,3,4,"test");
    Background clone1 = background.clone();
    clone1.setX(5);
    clone1.setY(5);
    Assert.assertNotEquals(background.getX(), clone1.getX());
  }

  @Test
  public void testClone() throws CloneNotSupportedException {
    Background background = new Background(1,2,3,4,"test");
    GameRegistry gameRegistry = new GameRegistry();
    gameRegistry.addPrototype("game1", background);
    GraphicalObject clone = gameRegistry.getPrototype("game1").clone();
    Assert.assertNotSame(background, clone);
  }

  @Test
  public void testFactory() throws CloneNotSupportedException {
    GameFactory gameFactory = new GameFactory();
    GraphicalObject game1 = gameFactory.getPrototype("game1");
    GraphicalObject game2 = gameFactory.getPrototype("game2");
    Assert.assertNotEquals(game1, game2);
    Assert.assertTrue(game1 instanceof Background);
    Assert.assertTrue(game2 instanceof Foreground);
  }
}
