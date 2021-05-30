package com.sarath.shopping.interfaze;

import com.sarath.shopping.Item;
import java.math.BigDecimal;

public class FranceRetailCalculator implements RetailCalculator {

  @Override
  public int getTax(Item item) {
    switch (item.getCategory()) {
      case "FOOD":
        return 7;
      default:
        return 12;
    }
  }

  @Override
  public int getCess(BigDecimal totalPrice) {
    return 3;
  }
}
