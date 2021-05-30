package com.sarath.shopping.interfaze;

import com.sarath.shopping.GermanRetailCalculator;
import com.sarath.shopping.Item;
import java.math.BigDecimal;
import java.util.Collections;

public class CartNewExample {

  public static void main(String[] args) {

    RetailCalculator retailCalculator = new FranceRetailCalculator();

    // For France
    Cart cart =  new Cart(Collections.emptyList(), retailCalculator);


    RetailCalculator retailCalculatorDE = new GermanRetailCalculator();
    Cart cartGerman =  new Cart(Collections.emptyList(), retailCalculatorDE);


  }

}
