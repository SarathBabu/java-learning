package com.sarath.innerclasses;

import com.sarath.innerclasses.EmployeeDetails.EmployeeDetailsValidator;

public class EmployeeDetailsWorking {

  public static void main(String[] args) {
    EmployeeDetails employeeDetails = new EmployeeDetails(1234,
        "Arun", " arun@gmail.com", "LEGAL");
    EmployeeDetailsValidator employeeDetailsValidator = new EmployeeDetailsValidator();
    System.out.printf("Valid: %s", employeeDetailsValidator.validate(employeeDetails));
  }

}
