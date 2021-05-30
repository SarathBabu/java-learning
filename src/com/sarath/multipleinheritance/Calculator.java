package com.sarath.multipleinheritance;

/**
 * Dependency Inversion
 */
public class Calculator implements Addition, Multiplication {

  private final Multiplication multiplication;  // Composition
  private final Addition addition; // Composition

  public Calculator(Multiplication multiplication, Addition addition) {
    this.multiplication = multiplication;
    this.addition = addition;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  @Override
  public int add(int a, int b) {
    return addition.add(a, b);
  }

  @Override
  public int mul(int a, int b) {
    return multiplication.mul(a, b);
  }
}
