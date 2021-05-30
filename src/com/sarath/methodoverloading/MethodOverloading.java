package com.sarath.methodoverloading;

public class MethodOverloading {

  public int sum(int a, int b) {
    return a + b;
  }

  public int sum(int a, int b, int c) {
    return a + b + c;
  }

  public int sum(String a, String b) {
    return Integer.parseInt(a) + Integer.parseInt(b);
  }

}
