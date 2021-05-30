package com.sarath.inheritance;

public class Manager extends Employee {

  private final int[] subordinates;

  public Manager(String _ssn, int empId, int[] subordinates) {
    super(_ssn, empId);
    this.subordinates = subordinates;
    ssn = "1244";
  }

  public int[] getSubordinates() {
    return subordinates;
  }
}
