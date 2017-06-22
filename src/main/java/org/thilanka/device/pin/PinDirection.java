package org.thilanka.device.pin;

/**
 * This enum models the direction of the pin relative to App Inventor as used in
 * the communication between the App Inventor components and the AndroidThings
 * companion running on the AndroidThings device.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum PinDirection {
  IN("in"), OUT("out");

  private final String mName;

  private PinDirection(String pPinDirection) {
    mName = pPinDirection;
  }

  public boolean equals(String pOther) {
    return (pOther == null) ? false : mName.equals(pOther);
  }

  public static PinDirection fromString(String pDirection) {
    if (pDirection != null) {
      for (PinDirection model : PinDirection.values()) {
        if (pDirection.equalsIgnoreCase(model.mName)) {
          return model;
        }
      }
    }
    return null;
  }

  public String getName() {
    return mName;
  }
}