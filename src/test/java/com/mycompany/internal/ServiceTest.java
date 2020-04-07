package com.mycompany.internal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
  Service sut = new Service();

  @Test
  @DisplayName("Should access value in tested class in package internal to the module.")
  void dummyTest() {
    assertEquals(
            11,
            sut.firstPrimeAfter(8));
  }
}
