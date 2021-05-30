package com.sarath.constructor;

public class AreaCalculator {

  private static final float PI = 3.14f;

//  public static int area(Circle circle) {
//    return (int) (PI * circle.getRadius() * circle.getRadius());
//  }

  public static int area(Rectangle rectangle) {
    return rectangle.getBreadth() * rectangle.getWidth();
  }

//  public static int area(Square square) {
//    return square.getWidth() * square.getWidth();
//  }

}
