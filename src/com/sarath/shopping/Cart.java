package com.sarath.shopping;


import com.sun.tools.javac.util.Pair;
import java.math.BigDecimal;
import java.util.List;

public class Cart {

  private final List<Pair<Item, Integer>> productsInTheCart;
  private final INDRetailCalculator INDRetailCalculator;
  private final USRetailCalculator usRetailCalculator;

  public Cart(
      List<Pair<Item, Integer>> productsInTheCart,
      INDRetailCalculator INDRetailCalculator,
      USRetailCalculator usRetailCalculator) {
    this.productsInTheCart = productsInTheCart;
    this.INDRetailCalculator = INDRetailCalculator;
    this.usRetailCalculator = usRetailCalculator;
  }

  public void finalize() {

    // US county use usRetailCalculator

    // use retail calculator to final amount calculations

    if ("US".equals("US")) {
      INDRetailCalculator.getTax(productsInTheCart.get(0).fst);
      INDRetailCalculator.getCess(BigDecimal.valueOf(1244L));
    } else {
      usRetailCalculator.getTax(productsInTheCart.get(0).fst);
      usRetailCalculator.getCess(BigDecimal.valueOf(1244L));
    }
    // finalization

  }

}
