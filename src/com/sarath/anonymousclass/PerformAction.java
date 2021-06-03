package com.sarath.anonymousclass;

import static com.sarath.anonymousclass.Action.COPY;
import static com.sarath.anonymousclass.Action.DEL;

import com.sarath.multipleinheritance.Addition;

public class PerformAction {

  public static void main(String[] args) {

    ActionPerformer actionPerformer = new ActionPerformer();

    Action copyAction = new Action(COPY);
    Action deleteAction = new Action(DEL);

//    ActionListener listener = new ActionListener() {
//      @Override
//      public void onActionPerformed(ActionEvent actionEvent) {
//
//      }
//    };

    actionPerformer.setActionListener(new ActionListener() {
      @Override
      public void onActionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getAction().getCode() == Action.COPY) {
          System.out.println("Copied------!!");
        } else {
          System.out.println("Deleted--------!!");
        }
      }
    });

    actionPerformer.doAction(copyAction);
    actionPerformer.doAction(deleteAction);


    // Listeners
    // Callback

    Addition addition = new Addition() {
      @Override
      public int add(int a, int b) {
        return a + b;
      }
    };






  }

}
