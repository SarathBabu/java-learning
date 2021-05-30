package com.sarath.coffee;

public class CoffeeExample {


  public static void main(String[] args) {

    CoffeeMachine coffeeMachine = new SugarlessCoffeeMachine(); // new CoffeeMachineImpl();
    coffeeMachine.makeCappuchino();
  }
}
