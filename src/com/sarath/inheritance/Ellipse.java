package com.sarath.inheritance;

public class Ellipse {

  private static final double PI = 3.14;
  protected final double rad2;
  private final double rad1;

  public Ellipse(double rad1, double rad2) {
    this.rad1 = rad1;
    this.rad2 = rad2;
  }

  public double area() {
    //return super.area(rad1);
    System.out.printf("Radius of ellipse %f %f\n", rad1, rad2);
    return PI * rad1 * rad2;
  }
}
