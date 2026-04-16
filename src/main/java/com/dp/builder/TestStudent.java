package com.dp.builder;

import org.junit.Test;

public class TestStudent {

  @Test
  public void test() {
    Student student = Student.builder()
    .setAge(1)
    .setGender("male")
    .setName("John")
    .build();
    System.out.println(student.getAge());
  }
}
