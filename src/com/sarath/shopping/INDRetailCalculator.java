package com.sarath.shopping;

import com.sarath.shopping.interfaze.RetailCalculator;
import java.math.BigDecimal;

public class INDRetailCalculator implements RetailCalculator {

  private static final int CESS_EDN = 1;
  private static final int CESS_FLODD = 1;


  public int getTax(Item item) {
    switch (item.getCategory()) {
      case "FOOD":
        return 5;
      default:
        return 14;
    }
  }

  public int getCess(BigDecimal totalPrice) {
    return CESS_EDN + CESS_FLODD;
  }

}
