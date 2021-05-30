package com.sarath.coffee;

public class CoffeeMachineImpl implements CoffeeMachine {

  @Override
  public Coffee makeCappuchino() {
    return new Coffee(3, 5, 25);
  }

  @Override
  public Coffee makeExpresso() {
    return new Coffee(3, 5, 15);
  }

  @Override
  public Coffee makeLattice() {
    return new Coffee(3, 5, 10);
  }
}
