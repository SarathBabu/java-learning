package com.sarath.anonymousclass;

public class ActionPerformer {

  private ActionListener actionListener;

  public void setActionListener(ActionListener actionListener) {
    this.actionListener = actionListener;
  }

  public void doAction(Action action) {
    // Codes to do the action

    if (actionListener != null) {
      actionListener.onActionPerformed(new ActionEvent(action));
    }
//    if(action.getCode() == Action.COPY){
//      System.out.println("Copied!!");
//    }else{
//      System.out.println("Deleted!!");
//    }
  }


}
