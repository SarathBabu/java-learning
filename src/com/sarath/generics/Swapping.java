package com.sarath.generics;

import com.sarath.multipleinheritance.Addition;
import com.sarath.multipleinheritance.AdditionImpl;
import com.sarath.pojo.Circle;
import com.sarath.pojo.Rectangle;

public class Swapping {


//  public <T> void swap(T first, T second) {
//    T temp = first;
//    first = second;
//    second = temp;
//  }

  public <T extends Addition> void swap(T first, T second) {
    T temp = first;
    first = second;
    second = temp;
  }


  public static void main(String[] args) {
    Swapping swapping = new Swapping();
//
//    swapping.swap(45, 78);
//
//    swapping.swap("werwwerwer", "qdqwqwasd");
//
//    swapping.swap(45.6f, 6.65);

   // swapping.swap(new Circle(3, ""), new Rectangle(45, 56));

    swapping.swap(new Addition() {
      @Override
      public int add(int a, int b) {
        return 0;
      }
    }, new AdditionImpl());


  }

}
