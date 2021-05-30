package com.sarath.methodoverloading;

import java.util.Objects;

public class Circle {

  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
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
    return radius == circle.radius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius);
  }
}
