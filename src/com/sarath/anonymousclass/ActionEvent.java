package com.sarath.anonymousclass;

public class ActionEvent {

  private final Action action;

  public ActionEvent(Action action) {
    this.action = action;
  }

  public Action getAction() {
    return action;
  }
}
