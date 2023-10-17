/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/23
 * File Name: Main.java
 * Description: This assignment is a notification system that alerts
 * drivers when a delivery is available.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment2.DeliveryRequest;
import edu.bu.met.cs665.assignment2.Driver;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * This method starts my build and assigns three drivers and one shop, and sends
   * an alert for this shop.
   */
  public static void main(String[] args) {
    DeliveryRequest shop1 = new DeliveryRequest();

    Driver del1 = new Driver("Van 1");
    Driver del2 = new Driver("Taxi 1");
    Driver del3 = new Driver("Scooter 1");

    shop1.register(del1);
    shop1.register(del2);
    shop1.register(del3);

    del1.registerDriver(shop1);
    del2.registerDriver(shop1);
    del3.registerDriver(shop1);

    shop1.order("Flour");
  }

}
