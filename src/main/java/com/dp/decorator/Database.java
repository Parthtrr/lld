package com.dp.decorator;

public interface Database<T> {
  T read();
  void write(T data);
}
