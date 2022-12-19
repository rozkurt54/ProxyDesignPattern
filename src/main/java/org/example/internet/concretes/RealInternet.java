package org.example.internet.concretes;

import org.example.internet.abstracts.Internet;

public class RealInternet implements Internet {

  @Override
  public void connectTo(String host) {
    System.out.println("Connecting to :" + host);
  }
}
