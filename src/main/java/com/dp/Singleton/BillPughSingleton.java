package com.dp.Singleton;

public class BillPughSingleton {

  private class Singleton {
    private static BillPughSingleton instance = new BillPughSingleton();
  }
  private BillPughSingleton() {}
  public static BillPughSingleton getInstance() {
    return Singleton.instance;
  }
}
