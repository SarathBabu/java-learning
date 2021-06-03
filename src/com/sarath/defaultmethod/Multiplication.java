package com.sarath.defaultmethod;

public interface Multiplication {

  default int mul(int a, int b) {
    return a * b;
  }

  default int div(int a, int b) {
    return a / b;
  }

}
