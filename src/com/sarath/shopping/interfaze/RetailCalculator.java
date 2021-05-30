package com.sarath.shopping.interfaze;

import com.sarath.shopping.Item;
import java.math.BigDecimal;

public interface RetailCalculator {

  int getTax(Item item);

  int getCess(BigDecimal totalPrice);
}


// Model POJO classes

// Business logic classes  // use interfaces