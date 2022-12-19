package org.example;

import org.example.internet.abstracts.Internet;
import org.example.internet.concretes.ProxyInternet;
import org.example.internet.concretes.RealInternet;

public class Main {
  public static void main(String[] args) {

    Internet internet = new RealInternet();
    internet.connectTo("abc.com");


    Internet proxyInternet = new ProxyInternet();
    proxyInternet.connectTo("abc.com"); // expected Runtime exception


  }
}