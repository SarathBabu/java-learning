package com.sarath.innerclasses;

public class EmployeeDetails {

  private final int empId;
  private final String name;
  private final String email;
  private final String department;

  public EmployeeDetails(int empId, String name, String email, String department) {
    this.empId = empId;
    this.name = name;
    this.email = email;
    this.department = department;
  }

  public static class EmployeeDetailsValidator {

    public boolean validate(EmployeeDetails employeeDetails) {
      boolean isValid = true;
      if (employeeDetails.email.length() < 8) {
        isValid = false;
      }
      if (employeeDetails.name.length() < 4 || employeeDetails.name.length() > 12) {
        isValid = false;
      }
      if (!(employeeDetails.department.equals("LEGAL") || employeeDetails.department.equals("ADMIN")
          || employeeDetails.department.equals("HR"))) {
        isValid = false;
      }
      return isValid;
    }
  }
}
