package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment2.Driver;
import edu.bu.met.cs665.assignment2.DeliveryRequest;
import org.junit.Test;


/**
 * These test the creation of five drivers and one shop. It creates an order and alerts
 * the drivers when and where an order is ready.
 */

public class TestDriver {
  public TestDriver(){

  }

  @Test
  public void testRegisterDriver(){
    DeliveryRequest shop = new DeliveryRequest();

    Driver del1 = new Driver("Van 1");
    Driver del2 = new Driver("Taxi 1");
    Driver del3 = new Driver("Scooter 1");
    Driver del4 = new Driver("Bike 1");
    Driver del5 = new Driver("Bike 2");

    shop.register(del1);
    shop.register(del2);
    shop.register(del3);
    shop.register(del4);
    shop.register(del5);

    del1.registerDriver(shop);
    del2.registerDriver(shop);
    del3.registerDriver(shop);
    del4.registerDriver(shop);
    del5.registerDriver(shop);

    shop.order("Flour");
    //assertTrue(del1.registerDrier(shop),() → "optional failure message"););

  }

  @Test
  public void testUnregisterDriver(){
    DeliveryRequest shop = new DeliveryRequest();

    Driver del1 = new Driver("Van 1");
    Driver del2 = new Driver("Taxi 1");
    Driver del3 = new Driver("Scooter 1");


    shop.register(del1);
    shop.register(del2);
    shop.register(del3);


    shop.unregister(del3);

    del1.registerDriver(shop);
    del2.registerDriver(shop);
    del3.registerDriver(shop);


    shop.order("Tatte");
    //assertTrue(del1.registerDrier(shop),() → "optional failure message"););

  }
  @Test
  public void testOrder(){
    DeliveryRequest shop = new DeliveryRequest();
    Driver del = new Driver("Car 1");
    shop.register(del);

    String name = "Pavement";

    del.registerDriver(shop);

    shop.order(name);
  }
}



