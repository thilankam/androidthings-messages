package org.thilanka.device.board;

/**
 * Given the name of the board as specified in the developer documentation of
 * the Google Android Things SDK, create the relevant {@link AndroidThingsBoard}
 * object.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class AndroidThingsBoardFactory {

  public static AndroidThingsBoard getBoard(String pBoardName){
    if (pBoardName.equals(IntelEdison.Model.INTEL_EDISON_ARDUINO.getName())) {
      return new IntelEdison(pBoardName);
    }
    if (pBoardName.equals(IntelEdison.Model.INTEL_EDISON_SPARKFUN.getName())) {
      return new IntelEdison(pBoardName);
    }
    if (pBoardName.equals(IntelJoule.Model.INTEL_JOULE.getName())) {
      return new IntelJoule(pBoardName);
    }
    if (pBoardName.equals(NXPiMX6UL.Model.NXP_I_MX6UL_ARGON.getName())) {
      return new NXPiMX6UL(pBoardName);
    }
    if (pBoardName.equals(NXPiMX6UL.Model.NXP_I_MX6UL_PICO.getName())) {
      return new NXPiMX6UL(pBoardName);
    }
    if (pBoardName.equals(NXPiMX7D.Model.NXP_I_MX7D.getName())) {
      return new NXPiMX7D(pBoardName);
    }
    if (pBoardName.equals(NXPiMX7D.Model.NXP_I_MX7D_PICO.getName())) {
      return new NXPiMX7D(pBoardName);
    }
    if (pBoardName.equals(RaspberrryPi.Model.RASPBERRY_PI_3.getName())) {
      return new RaspberrryPi(pBoardName);
    }
    return null;
  }

}
