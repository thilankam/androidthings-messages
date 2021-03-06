package org.thilanka.messaging.domain;

import org.thilanka.device.pin.PinDirection;
import org.thilanka.device.pin.PinProperty;
import org.thilanka.device.pin.PinValue;

/**
 * The java class that represents the payload that gets serialized to json and
 * back during the communication with AppInventor and the AndroidThings board.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class Payload {

  private PeripheralIO mPeripheralIO;

  private Action mAction;

  private String mName;

  private PinProperty mProperty;

  private PinValue mValue;

  private String mAndroidThingsBoard;

  private PinDirection mDirection;

  private String mLabel = "default";

  private double mDoubleValue;

  /**
   * @return the PeripheralIO
   */
  public PeripheralIO getPeripheralIO() {
    return mPeripheralIO;
  }

  /**
   * @param pPeripheralIO
   *          the PeripheralIO to set
   */
  public void setPeripheralIO(PeripheralIO pPeripheralIO) {
    mPeripheralIO = pPeripheralIO;
  }

  /**
   * @return what type of message action this is.
   */
  public Action getAction() {
    return mAction;
  }

  /**
   * Sets the given message action for this GPIO pin.
   * 
   * @param pAction
   */
  public void setAction(Action pAction) {
    mAction = pAction;
  }

  /**
   * @return the corresponding name of the pin.
   */
  public String getName() {
    return mName;
  }

  /**
   * @param pName
   *          the name of the pin to set
   */
  public void setName(String pName) {
    mName = pName;
  }

  /**
   * @return the property
   */
  public PinProperty getProperty() {
    return mProperty;
  }

  /**
   * @param property
   *          the property to set
   */
  public void setProperty(PinProperty pProperty) {
    mProperty = pProperty;
  }

  /**
   * @return the value
   */
  public PinValue getValue() {
    return mValue;
  }

  /**
   * @param pValue
   *          the value to set
   */
  public void setValue(PinValue pValue) {
    mValue = pValue;
  }

  /**
   * @return the value if it is a double.
   */
  public double getDoubleValue() {
    return mDoubleValue;
  }

  /**
   * Set the value if it is a double
   * 
   * @param pDoubleValue
   */
  public void setDoubleValue(double pDoubleValue) {
    mDoubleValue = pDoubleValue;
  }

  /**
   * @return the AndroidThingsBoard
   */
  public String getAndroidThingsBoard() {
    return mAndroidThingsBoard;
  }

  /**
   * @param pAndroidThingsBoard
   *          the AndroidThingsBoard to set
   */
  public void setAndroidThingsBoard(String pAndroidThingsBoard) {
    mAndroidThingsBoard = pAndroidThingsBoard;
  }

  /**
   * @return the Direction
   */
  public PinDirection getDirection() {
    return mDirection;
  }

  /**
   * @param pDirection
   *          the direction to set
   */
  public void setDirection(PinDirection pDirection) {
    mDirection = pDirection;
  }

  /**
   * @return the label
   */
  public String getLabel() {
    return mLabel;
  }

  /**
   * @param pLabel
   *          the label to set
   */
  public void setLabel(String pLabel) {
    mLabel = pLabel;
  }

  public boolean isInvalid() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " [Peripheral IO : " + mPeripheralIO
        + "number:" + mName + ", property:"
        + (mProperty == null ? "" : mProperty.toString())
        + ", value:" + (mValue == null ? "" : mValue.toString())
        + ", doubleValue:" + mDoubleValue
        + ", androidThingsBoard:"
        + mAndroidThingsBoard + ", direction:" + (mDirection == null
            ? PinDirection.IN.toString() : mDirection.toString())
        + ", label: " + mLabel + "]";
  }
}
