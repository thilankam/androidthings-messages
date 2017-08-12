package org.thilanka.messaging.domain;

/**
 * This enum holds the topics used in the communication between the App Inventor
 * components and the AndroidThings companion running on the Android Things
 * board.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum Topic {
  ANDROID_THINGS("/androidthings/"), 
  APP_INVENTOR("/appinventor/");

  private final String mName;

  private Topic(String pTopic) {
    mName = pTopic;
  }

  public boolean equals(String pOther) {
    return (pOther == null) ? false : mName.equals(pOther);
  }

  public String getName() {
    return mName;
  }

  @Override
  public String toString() {
    return getName();
  }
}
