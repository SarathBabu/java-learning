package com.sarath.pojos;

import static com.sarath.pojos.Person.MALE;
import static com.sarath.pojos.Person.PRINCIPAL;

public class PojosExample {

  public static void main(String[] args) {

    Person person = new Person();

    person.setAge(10);
    person.setName("James");
    person.setGender(MALE);
    person.setJob(PRINCIPAL);

    System.out.println(person.getAge());
    System.out.println(person.getName());

    if (person.getGender() == MALE) {

    } else {

    }


  }

}
