package com.sarath.genericstwo;

import com.sarath.pojo.Circle;
import com.sarath.pojo.Rectangle;

public class AreaCalculator<S>{

  public double area(S shape){

    if (shape instanceof Circle) {
      Circle circle = (Circle) shape;
      return 3.14 * circle.getRadius()* circle.getRadius();
    }else if (shape instanceof Rectangle){
      Rectangle rectangle = (Rectangle) shape;
      return (double) (rectangle.getBreadth() * rectangle.getWith());
    }
    return 0;
  }

}
