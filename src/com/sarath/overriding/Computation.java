package com.sarath.overriding;

import java.util.Locale;

public class Computation {

  public String execute(String problem) {
    Computer computer = null;
    if (problem.contains("high")) {
      computer = new SuperComputer();
    } else {
      computer = new Computer();
    }
    return computer.compute(problem);   // Which function will be invoked?
  }

  public static void main(String[] args) {
    String problem = "Simple problem require low computation power";
    String bigProblem = "Problem that need high computation power";

    Computation computation = new Computation();
    computation.execute(problem);
    computation.execute(bigProblem);


  }


}
