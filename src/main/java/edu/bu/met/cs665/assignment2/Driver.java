/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/23
 * File Name: Driverp.java
 * Description: This class assigns the driver name,
 * sends the alert message, and registers the driver.
 */

package edu.bu.met.cs665.assignment2;

public class Driver implements DriverInterface {
  private String name;
  private DeliveryRequest deliveryRequest = new DeliveryRequest();

  public Driver(String name) {
    this.name = name;
  }

  /**
   * This method will format and alert sent to
   * drivers, including important information.
   */
  @Override
  public void update() {
    System.out.println("Hello "
            + name
            + ", a new delivery order is ready at "
            + deliveryRequest.shopName);
  }

  /**
   * This method will register each driver to receive alert.
   */
  @Override
  public void registerDriver(DeliveryRequest ord) {
    deliveryRequest = ord;
  }
}
