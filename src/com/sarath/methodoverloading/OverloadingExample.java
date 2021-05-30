package com.sarath.methodoverloading;


public class OverloadingExample {

  public static void main(String[] args) {

    Square square = new Square();
    square.setWidth(34);

    Circle circle = new Circle();
    circle.setRadius(12);

    Rectangle rectangle = new Rectangle();
    rectangle.setBreadth(34);
    rectangle.setWith(27);

    AreaCalculator calculator = new AreaCalculator();

    System.out.printf("Area of circle = %d\n", calculator.area(circle));
    System.out.printf("Area of rectangle = %d\n", calculator.area(rectangle));
    System.out.printf("Area of square = %d\n", calculator.area(square));

  }

}
