package org.thilanka.messaging.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PayloadTest {
  
  @Test
  public void testPayloadDeconstruction(){
    String message =
        "{\"mDirection\":\"OUT\",\"mName\":\"GPIO_34\",\"mProperty\":\"PIN_STATE\",\"mValue\":\"LOW\"}";
    Payload payload = Message.deconstrctMessage(message);
    assertEquals("OUT", payload.getDirection().toString());
    assertEquals("GPIO_34", payload.getName());
    assertEquals("PIN_STATE", payload.getProperty().toString());
    assertEquals("LOW", payload.getValue().toString());
  }
}
