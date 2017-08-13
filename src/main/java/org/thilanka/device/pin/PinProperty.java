package org.thilanka.device.pin;

/**
 * This enum models the different properties of the pins used in the
 * communication between the App Inventor components and the AndroidThings
 * companion when running on the AndroidThings device.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public enum PinProperty {
  PIN_STATE("pinState"), REGISTER("registerPin"), DUTY_CYCLE(
      "dutyCycle"), FREQUENCY("frequency"), TEMPERATURE("temperature");

  private final String mName;

  private PinProperty(String pPinProperty) {
    mName = pPinProperty;
  }

  public boolean equals(String pOther) {
    return (pOther == null) ? false : mName.equals(pOther);
  }

  public String getName() {
    return mName;
  }
}
