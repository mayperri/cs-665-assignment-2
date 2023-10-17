/**
 * Name: May Perriello
 * Course: CS-665- Software Design & Patterns
 * Date: 10/10/23
 * File Name: DriverInterface.java
 * Description: This interface is for registering and updating the driver.
 * It holds the update() and registerDriver() methods.
 */

package edu.bu.met.cs665.assignment2;

public interface DriverInterface {
  void update();

  void registerDriver(DeliveryRequest ord);
}
