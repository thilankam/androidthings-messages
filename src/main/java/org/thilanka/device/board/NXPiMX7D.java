package org.thilanka.device.board;

/**
 * This class holds the supported NXPi.MX7D model used in the communication
 * between the App Inventor components and the AndroidThings companion running
 * on the NXPi.MX7D board. For the hardware details (i.e. pinout) supported by
 * the Google Android Things API, please see the NXPi.MX7D available at
 * <a href="https://developer.android.com/things/hardware/imx7d.html"> https://
 * developer.android.com/things/hardware/imx7d.html</a>.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class NXPiMX7D implements AndroidThingsBoard {

  public enum Model {
    NXP_I_MX7D("NXP i.MX7D");

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
  public NXPiMX7D(String pModelName) {
    mModel = Model.fromString(pModelName);
  }

  public String getName() {
    return mModel.getName();
  }
}
