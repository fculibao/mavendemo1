package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  @param some info here
  @param some info here
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
