package com.sarath.anonymousclass;

public class Action {

  public static final int COPY = 123;
  public static final int DEL = 234;

  private final int code;

  public Action(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}
