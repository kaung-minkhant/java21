package com.java21days;

public class InstanceCounter {
  private static int count = 0;

  protected static int getCount() {
    return count;
  }
  
  private static void incrementCount() {
    count++;
  }
  protected InstanceCounter() {
    incrementCount();
  }

  public static void main(String[] args) {
    System.out.println("Starting with count = " + InstanceCounter.getCount());
    for (int i = 0; i < 500; i++) {
      InstanceCounter ic = new InstanceCounter();
    }
    System.out.println("Final count = " + InstanceCounter.getCount());
  }
}
