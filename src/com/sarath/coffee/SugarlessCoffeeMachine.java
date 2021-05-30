package com.sarath.coffee;

public class SugarlessCoffeeMachine implements CoffeeMachine {

  @Override
  public Coffee makeCappuchino() {
    return new Coffee(0, 5, 25);
  }

  @Override
  public Coffee makeExpresso() {
    return new Coffee(0, 5, 15);
  }

  @Override
  public Coffee makeLattice() {
    return new Coffee(0, 5, 10);
  }
}
