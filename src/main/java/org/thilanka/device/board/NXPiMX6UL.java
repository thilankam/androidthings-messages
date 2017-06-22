package org.thilanka.device.board;

/**
 * This class holds the supported NXPi.MX 6 series model used in the
 * communication between the App Inventor components and the AndroidThings
 * companion running on the NXPi.MX 6 board. For the hardware details (i.e.
 * pinout) supported by the Google Android Things API, please see the NXPi.MX 6
 * available at
 * <a href="https://developer.android.com/things/hardware/imx6ul.html"> https://
 * developer.android.com/things/hardware/imx6ul.html</a>.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class NXPiMX6UL implements AndroidThingsBoard {

  public enum Model {
    NXP_I_MX6UL_PICO("NXP i.MX6 Pico"), NXP_I_MX6UL_ARGON("NXP i.MX6 Argon");

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
  public NXPiMX6UL(String pModelName) {
    mModel = Model.fromString(pModelName);
  }

  public String getName() {
    return mModel.getName();
  }
}
