package com.sarath.inheritance;

public class Person {

  protected String ssn;

  public int height = 168;

  public Person(String ssn) {
    this.ssn = ssn;
  }

  public String getSsn() {
    return ssn;
  }
}
