package com.sarath.pojo;

public class PojoEqualsHashCode {


  public static void main(String[] args) {

    Circle c1 = new Circle(34, "CM");
    Circle c2 = new Circle(25, "MM");
    Circle c3 = new Circle(25, "FEET");
    Circle c4 = c1;

    Rectangle r1 = new Rectangle(23, 67);

    //System.out.println(c1.equals(c4));
    // System.out.println(c1.equals(r1));

    System.out.println(c2.equals(c3));

    System.out.println(c2.hashCode());
    System.out.println(c1.hashCode());

  }
}
