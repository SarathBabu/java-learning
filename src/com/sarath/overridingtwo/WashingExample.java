package com.sarath.overridingtwo;

public class WashingExample {

  public static void main(String[] args) {

    String[] cloths = new String[10];

    WashingMachine washingMachine = new WashingMachine();
   // washingMachine.wash(cloths);

    washingMachine = new NewGenWashingMachine();
    washingMachine.wash(cloths);
  }

}
