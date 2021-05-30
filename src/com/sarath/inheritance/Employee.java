package com.sarath.inheritance;

public class Employee extends Person {

  private final int empId;

  public Employee(String _ssn, int empId) {
    super(_ssn);
    this.empId = empId;
    ssn = "543464356";
  }

  public int getEmpId() {
    return empId;
  }
}
