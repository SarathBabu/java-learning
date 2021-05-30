package com.sarath.conditional;

public class JavaConditionals {


  public static void main(String[] args) {
    if (3 < 45) {

    } else if (67 == 90) {

    } else {

    }

    int day = 2;

    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      default:
        System.out.println("Sunday");
    }

    String dayStr = "Sunday";
    switch (dayStr) {
      case "Monday":
        System.out.println(1);
        break;
      case "Thursday":
        System.out.println(4);
        break;
      default:
        System.out.println(7);
    }
  }

}
