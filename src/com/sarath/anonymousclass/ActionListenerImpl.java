package com.sarath.anonymousclass;

public class ActionListenerImpl implements ActionListener {

  @Override
  public void onActionPerformed(ActionEvent actionEvent) {
    if (actionEvent.getAction().getCode() == Action.COPY) {
      System.out.println("Copied!!");
    } else {
      System.out.println("Deleted!!");
    }
  }
}
