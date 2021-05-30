package com.sarath.operator;

public class JavaOperators {

  public static void main(String[] args) {

    int sum = 10 + 90;

    int newSum = sum++;

    sum = sum + 1;

    System.out.println(newSum);

    System.out.println(sum);

    String str = "Hi";

    if (str instanceof String) {
      System.out.printf("%s is an instance of String.class\n", str);
    }

    if (!(str instanceof CharSequence)) {
      System.out.printf("%s is an instance of CharSequence.class\n", str);
    }

    CharSequence ch = "asdasd";
    if (ch instanceof String) {
      System.out.printf("%s is an instance of String.class\n", str);
    }

    int z = 23 < sum ? 34 : 67;
    System.out.println(z);


  }

}
