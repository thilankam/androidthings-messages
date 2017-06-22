package org.thilanka.device.pin;

/**
 * This enum holds the different states a pin can be in. These values are used
 * in the communication between the App Inventor components and the
 * AndroidThings companion running on the AndroidThings board.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum PinValue {
  HIGH("high"), LOW("low");

  private final String mName;

  private PinValue(String pPinValue) {
    mName = pPinValue;
  }

  public boolean equals(String pOther) {
    return (pOther == null) ? false : mName.equals(pOther);
  }

  public String getName() {
    return mName;
  }

}
