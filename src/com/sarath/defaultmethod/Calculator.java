package com.sarath.defaultmethod;

public class Calculator implements Addition, Multiplication {

  @Override
  public int div(int a, int b) {
    return Multiplication.super.mul(3, 6);
  }
}
