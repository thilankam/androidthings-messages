package org.thilanka.device.board;

/**
 * This class holds the supported Intel Edison model used in the communication
 * between the App Inventor components and the AndroidThings companion running
 * on the Intel Edison board. For the hardware details (i.e. pinout) supported
 * by the Google Android Things API, please see the Intel Edison Kit available
 * at
 * <a href="https://developer.android.com/things/hardware/edison.html"> https://
 * developer.android.com/things/hardware/edison.html</a>.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class IntelEdison implements AndroidThingsBoard {

  public enum Model {
    INTEL_EDISON_ARDUINO("Intel Edison Adruino"), INTEL_EDISON_SPARKFUN(
        "Intel Edison Sparkfun");

    private final String mName;

    private Model(String pModel) {
      mName = pModel;
    }

    public boolean equals(String pOther) {
      return (pOther == null) ? false : mName.equals(pOther);
    }

    public static Model fromString(String pModel) {
      if (pModel != null) {
        for (Model model : Model.values()) {
          if (pModel.equalsIgnoreCase(model.mName)) {
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

  private Model mModel;

  /**
   * The Constructor.
   * 
   * @param pModelName
   */
  public IntelEdison(String pModelName) {
    mModel = Model.fromString(pModelName);
  }

  public String getName() {
    return mModel.getName();
  }
}
