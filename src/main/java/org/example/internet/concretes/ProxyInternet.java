package org.example.internet.concretes;

import org.example.internet.abstracts.Internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

  private Internet internet = new RealInternet();
  private static List<String> blockedSiteList;

  static {
    blockedSiteList = new ArrayList<>();
    blockedSiteList.add("abc.com");
    blockedSiteList.add("cde.com");
    blockedSiteList.add("def.com");

  }


  @Override
  public void connectTo(String host) {

    if(blockedSiteList.contains(host.toLowerCase())){
      throw new RuntimeException("Access denied");
    }
    internet.connectTo(host);

  }
}
