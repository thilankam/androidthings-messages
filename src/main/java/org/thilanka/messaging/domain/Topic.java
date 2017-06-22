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
  INTERNAL("mit-appinventor/androidthings/internal/");

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

}
