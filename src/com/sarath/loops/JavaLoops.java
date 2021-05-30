package com.sarath.loops;

public class JavaLoops {

  public static void main(String[] args) {

    int count = 10;
    int i = 0;
    while (i < count) {
      System.out.println(i);
      i++;
    }

    int j = 1;
    do {
      System.out.println(j);
      j++;
    } while (j <= 10);

    for (int k = 0; k <= 10; k++) {
      System.out.println(k);
    }
  }

}
