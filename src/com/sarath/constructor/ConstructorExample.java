package com.sarath.constructor;

import static com.sarath.constructor.AreaCalculator.area;

public class ConstructorExample {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(25, 5); // Initialized with parameterized constructor

    //Rectangle rectangle1 = new Rectangle(); // Initialized with default constructor

    System.out.println(area(rectangle));

   // System.out.println(area(rectangle1));


  }

}
