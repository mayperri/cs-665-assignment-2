/**
 * Name: May Perriello
 * Course: CS-665- Software Design & Patterns
 * Date: 10/10/23
 * File Name: DeliveryRequestInterface.java
 * Description: This interface is for registering and unregistering the drivers. It will also
 * update the order and notify the drivers.
 * It holds the register(), unregister(), notifyDrivers(), and order() methods.
 */

package edu.bu.met.cs665.assignment2;

public interface DeliveryRequestInterface {
  void register(Driver obv);

  void unregister(Driver obv);

  void notifyDrivers();

  void order(String request);
}
