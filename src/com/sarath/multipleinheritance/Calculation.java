package com.sarath.multipleinheritance;

public class Calculation {

  public static void main(String[] args) {
    Calculator calculator = new Calculator(new MultiplicationImpl(), new AdditionImpl());

    int sum = calculator.add(2, 6);

    int sub = calculator.sub(5, 9);
  }

}
