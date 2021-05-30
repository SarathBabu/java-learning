package com.sarath.shopping;

import java.util.Collections;

public class CartExample {

  public static void main(String[] args) {
    Cart cart  = new Cart(Collections.emptyList(),
        new INDRetailCalculator(),
        new USRetailCalculator());


  }
}
