package com.dp.decorator;

public class EncryptionDecorator extends Decorator implements Database<String>{

  public EncryptionDecorator(Database<String> database) {
    super(database);
  }
  @Override
  public String read() {
    return decrypt(this.database.read());
  }

  private String decrypt(String read) {
    return "decrypt " + read;
  }

  @Override
  public void write(String data) {
    database.write(encrypt(data));
  }

  private String encrypt(String data) {
    return "encrypt " + data;
  }
}
