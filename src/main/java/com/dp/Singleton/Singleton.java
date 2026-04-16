package com.dp.Singleton;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton {
  private static volatile Singleton instance;
  private Singleton() {}
  public static Singleton getInstance() {
     if (instance == null) {
       synchronized (Singleton.class) {
         if (instance == null) {
           instance = new Singleton();
//           This second check is because when 2 threads are inside the 1st if together after the lock releases 2nd one will also call the new Singleton()
         }
       }
    }
    return instance;
  }
}
