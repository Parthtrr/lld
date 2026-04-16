package com.dp.builder;

import lombok.Getter;

@Getter
public class Student {
  private final String name;
  private final  int age;
  private final String gender;

  public static StudentBuilder builder() {
    return new StudentBuilder();
  }

  private Student(StudentBuilder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.gender = builder.gender;
  }


  public static class StudentBuilder {
    private String name;
    private int age;
    private String gender;

    public Student build() {
      validate();
      return new Student(this);
    }

    private void validate() {
      if (name == null || name.isEmpty()) {
        throw new IllegalArgumentException("Name is required");
      }
      if (age < 0 || age > 100) {
        throw new IllegalArgumentException("Age must be between 0 and 100");
      }
      if (gender == null || gender.isEmpty()) {
        throw new IllegalArgumentException("Gender is required");
      }
    }
    public StudentBuilder setName(String name) {
      this.name = name;
      return this;
    }
    public StudentBuilder setAge(int age) {
      this.age = age;
      return this;
    }
    public StudentBuilder setGender(String gender) {
      this.gender = gender;
      return this;
    }
  }

}
