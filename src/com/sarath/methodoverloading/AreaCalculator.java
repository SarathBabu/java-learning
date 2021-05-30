package com.sarath.methodoverloading;

public class AreaCalculator {

  private static final float PI = 3.14f;

  public  int area(Circle circle) {
    return (int) (PI * circle.getRadius() * circle.getRadius());
  }

  public  int area(Rectangle rectangle) {
    return rectangle.getBreadth() * rectangle.getWith();
  }

  public  int area(Square square) {
    return square.getWidth() * square.getWidth();
  }

}
