package com.sarath.defaultmethod;

public class Calculation {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int sum = calculator.add(3, 7);
    System.out.println(sum);

    calculator.mul(5, 8);

    System.out.println(calculator.div(6, 3));

    String s = Addition.INDIA;
  }

}
