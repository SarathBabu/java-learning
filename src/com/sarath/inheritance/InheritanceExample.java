package com.sarath.inheritance;

import java.util.Arrays;

public class InheritanceExample {

  public static void main(String[] args) {

    Person person = new Person("112453465");
    System.out.println(person.getSsn());

    // Employee

    Employee employee = new Employee("4213423435", 3455);
    System.out.println(employee.getEmpId());
    System.out.println(employee.getSsn());

    // Manager

    Manager manager = new Manager("457587686", 454, new int[]{132, 3355, 4545});
    System.out.println(Arrays.toString(manager.getSubordinates()));
    System.out.println(manager.getEmpId());
    System.out.println(manager.getSsn());

    Manager newManager = manager;

    Employee newEmployee = manager;

    Person newPerson = manager;

    Circle circle = new Circle(23);
    circle.area();

  }

}
