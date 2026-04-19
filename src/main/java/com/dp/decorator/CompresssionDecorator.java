package com.dp.decorator;

public class CompresssionDecorator extends Decorator implements Database<String>{

  public CompresssionDecorator(Database<String> database) {
    super(database);
  }
  @Override
  public String read() {
    return deCompress(database.read());
  }

  private String deCompress(String read) {
    return "de-compress " + read;
  }

  @Override
  public void write(String data) {
    database.write(compress(data));
  }

  private String compress(String data) {
    return "compress " + data;
  }
}
