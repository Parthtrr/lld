package com.dp.Singleton;

import org.junit.Assert;
import org.junit.Test;

public class TestSingleton {

  @Test
  public void test() {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    Assert.assertSame(singleton1, singleton2);
  }

  @Test
  public void test2() {
    Singletttton obj = Singletttton.INSTANCE;
    Singletttton obj1 = Singletttton.INSTANCE;
    Assert.assertSame(obj, obj1);
  }

}
