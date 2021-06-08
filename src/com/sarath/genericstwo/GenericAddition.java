package com.sarath.genericstwo;

import java.math.BigDecimal;

public class GenericAddition<U> {

  public U add(U a, U b) {
    if(a instanceof BigDecimal && b instanceof BigDecimal){
      return (U) ((BigDecimal) a).add((BigDecimal)b);
    }
    if(a instanceof Float && b instanceof Float){
      return (U) Float.valueOf(((Float)a).floatValue() + ((Float)b).floatValue());
    }
    return null;
  }

}
