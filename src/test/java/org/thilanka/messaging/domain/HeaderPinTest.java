package org.thilanka.messaging.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeaderPinTest {
  
  @Test
  public void testHeaderPinDeconstrction(){
    String message =
        "{\"mDirection\":\"OUT\",\"mName\":\"GPIO_34\",\"mProperty\":\"PIN_STATE\",\"mValue\":\"LOW\"}";
    HeaderPin pin = Message.deconstrctPinMessage(message);
    assertEquals("OUT", pin.getDirection().toString());
    assertEquals("GPIO_34", pin.getName());
    assertEquals("PIN_STATE", pin.getProperty().toString());
    assertEquals("LOW", pin.getValue().toString());
  }

}
