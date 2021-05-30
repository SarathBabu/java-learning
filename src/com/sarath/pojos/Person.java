package com.sarath.pojos;

public class Person {

  public static final int MALE = 100;
  public static final int FEMALE = 101;

  public static final String TEACHER = "Teacher";
  public static final String PRINCIPAL = "Principal";


  private String name;   // Instance variables

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  private String address;
  private String phone;
  private int age;
  private int gender;
  private String job;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }
}
