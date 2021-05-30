package com.sarath.overriding;

/**
 * Can handle simple problems
 */
public class Computer {

  // Fields declarations

  public String compute(String theProblem) {
    /// Processing the problem
    System.out.printf("Simple: Solving \"%s\" using Computer\n", theProblem);
    return "solution";
  }
}
