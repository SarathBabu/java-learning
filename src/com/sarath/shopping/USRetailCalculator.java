package com.sarath.shopping;

import com.sarath.shopping.interfaze.RetailCalculator;
import java.math.BigDecimal;

public class USRetailCalculator implements RetailCalculator {

  public int getTax(Item item) {
    switch (item.getCategory()) {
      case "FOOD":
        return 2;
      default:
        return 18;
    }
  }

  public int getCess(BigDecimal totalPrice) {
    return 0;
  }
}
