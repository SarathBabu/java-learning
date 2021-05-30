package com.sarath.overridingtwo;

public class NewGenWashingMachine extends WashingMachine {

  @Override
  public void wash(String[] cloths) {
    super.wash(cloths);
    System.out.println("Drying");
  }
}
