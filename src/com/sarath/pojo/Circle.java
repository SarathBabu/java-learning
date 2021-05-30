package com.sarath.pojo;

import java.util.Objects;

public class Circle {

  private final int radius;
  private final String unit;

  public Circle(int radius, String unit) {
    this.radius = radius;
    this.unit = unit;
  }

  public int getRadius() {
    return radius;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Circle circle = (Circle) o;
    return radius == circle.radius && unit.equals(circle.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius, unit);
  }
}
