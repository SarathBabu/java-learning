package com.sarath.shopping.interfaze;


import com.sarath.shopping.Item;
import com.sun.tools.javac.util.Pair;
import java.math.BigDecimal;
import java.util.List;

public class Cart {

  private final List<Pair<Item, Integer>> productsInTheCart;
  private final RetailCalculator retailCalculator;

  public Cart(
      List<Pair<Item, Integer>> productsInTheCart,
      RetailCalculator retailCalculator) {
    this.productsInTheCart = productsInTheCart;
    this.retailCalculator = retailCalculator;
  }

  public void finalize() {

    // US county use usRetailCalculator

    // use retail calculator to final amount calculations

    retailCalculator.getTax(productsInTheCart.get(0).fst);
    retailCalculator.getCess(BigDecimal.valueOf(1244L));

    // finalization

  }

}
