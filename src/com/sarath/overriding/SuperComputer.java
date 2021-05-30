package com.sarath.overriding;

public class SuperComputer extends Computer {


  @Override
  public String compute(String theProblem) {
    /// Processing the problem
    System.out.printf("Complex: Solving \"%s\" using Super Computer\n", theProblem);
    return "solution";
  }
}
