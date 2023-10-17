/**
 * Name: May Perriello
 * Course: CS-665- Software Design & Patterns
 * Date: 10/10/23
 * File Name: DeliveryRequest.java
 * Description: This class registers the drivers for alerts
 * and sends notifications when orders are available.
 */

package edu.bu.met.cs665.assignment2;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRequest implements DeliveryRequestInterface {
  private List<Driver> obvs = new ArrayList<>();
  //String request;

  private Shop shop = new Shop();
  String shopName;

  /**
   * This method will register drivers for alerts.
   */
  @Override
  public void register(Driver obv) {
    obvs.add(obv);
  }

  /**
   * This method will unregister drivers for alerts.
   */
  @Override
  public void unregister(Driver obv) {
    obvs.remove(obv);
  }

  /**
   * This method will send notifications
   * to each registered driver.
   */
  @Override
  public void notifyDrivers() {
    for (Driver obv: obvs) {
      obv.update();
    }
  }

  /**
   * This method will get the shop name
   * for the order and trigger an alert to
   * be started.
   */
  @Override
  public void order(String shopName) {

    shop.setShopName(shopName);
    this. shopName = shop.getShopName();
    notifyDrivers();
  }
}
