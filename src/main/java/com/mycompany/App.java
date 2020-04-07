package com.mycompany;


import com.mycompany.internal.Service;

public class App {
  private Service service = new Service();

  public long firstPrimeAfter(long number) {
    return service.firstPrimeAfter(number);
  }
}
