package org.thilanka.messaging.error;

/**
 * This is for Connection Error that can be caused when using the MQTT protocol.
 *
 * @author Thilanka Munasinghe (thilankawillbe@gmail.com)
 */
public class ConnectionError extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ConnectionError(String pError) {
    super(pError);
  }
}