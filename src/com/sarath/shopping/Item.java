package com.sarath.shopping;

import java.math.BigDecimal;

public class Item {

  private final BigDecimal price;
  private final String category;

  public Item(BigDecimal price, String category) {
    this.price = price;
    this.category = category;
  }

  public Item(String price, String category) {
    this.price = new BigDecimal(price);
    this.category = category;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public String getCategory() {
    return category;
  }
}
