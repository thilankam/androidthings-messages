package org.thilanka.messaging.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This singleton class holds the internal messages used in the communication
 * between the App Inventor components and the AndroidThings companion running
 * on an Android Things board.
 * 
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 *
 */
public class Message {

  private static Message sInstance = null;

  private static GsonBuilder sBuilder = new GsonBuilder();
  private static Gson sGson = sBuilder.create();

  protected Message() {
    // Empty
  }

  public static Message getInstance() {
    if (sInstance == null) {
      sInstance = new Message();
    }
    return sInstance;
  }

  public static String constructPinMessage(HeaderPin pHeaderPin) {
    return sGson.toJson(pHeaderPin);
  }

  public static HeaderPin deconstrctPinMessage(String pMessage) {
    return sGson.fromJson(pMessage, HeaderPin.class);
  }
}
