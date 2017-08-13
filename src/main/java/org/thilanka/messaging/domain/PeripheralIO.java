package org.thilanka.messaging.domain;

/**
 * This enum holds the different peripheral IO types available on the Android
 * Things Board.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 */
public enum PeripheralIO {
  GPIO("gpio"),
  PWM("pwm"),
  I2C("i2c"),
  SPI("spi"),
  UART("uart"),
  I2S("i2s"),
  NATIVE_PIO("native_pio"),
  TEMPERATURE_SENSOR("temperature_sensor");

  private final String mName;

  private PeripheralIO(String pAction) {
    mName = pAction;
  }

  public boolean equals(String pOther) {
    return (pOther == null) ? false : mName.equals(pOther);
  }

  public String getName() {
    return mName;
  }


}
