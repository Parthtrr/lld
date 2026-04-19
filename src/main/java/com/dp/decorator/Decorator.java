package com.dp.decorator;

public abstract class Decorator extends DatabaseImpl implements Database<String>{
  Database<String> database;

  public Decorator(Database<String> database) {
    this.database = database;
  }
}
