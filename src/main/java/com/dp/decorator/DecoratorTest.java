package com.dp.decorator;

import org.junit.Test;

public class DecoratorTest {
  @Test
  public void testDecorator() {
    Database<String> db = new DatabaseImpl();
    Database<String> dbEncrypt = new EncryptionDecorator(db);
    Database<String> dbCompress = new CompresssionDecorator(dbEncrypt);
    System.out.println(db.read());
    System.out.println(dbEncrypt.read());
    System.out.println(dbCompress.read());

    db.write("hehe");
    dbEncrypt.write("hehe");
    dbCompress.write("hehe");
  }
}
