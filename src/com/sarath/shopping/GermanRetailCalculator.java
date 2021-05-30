package com.sarath.shopping;

import com.sarath.shopping.interfaze.RetailCalculator;
import java.math.BigDecimal;

public class GermanRetailCalculator implements RetailCalculator {

  public int getTax(Item item) {
    switch (item.getCategory()) {
      case "FOOD":
        return 12;
      default:
        return 24;
    }
  }

  public int getCess(BigDecimal totalPrice) {
    return 0;
  }
}
