package com.dp.decorator;

public class DatabaseImpl implements Database<String> {

  @Override
  public String read() {
    return "base read";
  }

  @Override
  public void write(String data) {
    System.out.println("base write " + data);
  }
}
