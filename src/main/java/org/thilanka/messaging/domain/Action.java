package org.thilanka.messaging.domain;

/**
 * This enum holds the different actions communication between the App Inventor
 * components and the AndroidThings companion running on the Android Things
 * Board.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum Action {
  REGISTER("register"),
  EVENT("event"),
  SHUTDOWN("shutdown");

  private final String mName;

  private Action(String pAction) {
    mName = pAction;
  }

  public boolean equals(String pOther) {
    return (pOther == null) ? false : mName.equals(pOther);
  }

  public String getName() {
    return mName;
  }

}
