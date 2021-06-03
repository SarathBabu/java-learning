package com.sarath.defaultmethod;

public interface Addition {

  default int add(int a, int b) {
    return a + b;
  }

  default int div(int a, int b) {
    return a / b * 1000;
  }

  static String myStaticMethod() {
    return "Hi";
  }

  String INDIA = "IND";

}
