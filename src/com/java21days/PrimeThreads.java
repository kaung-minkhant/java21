package com.java21days;

public class PrimeThreads {
  public static void main(String[] arguments) {
    new PrimeThreads(arguments);
  }

  PrimeThreads(String[] arguments) {
    PrimeFinder[] finders = new PrimeFinder[arguments.length];
    for (int i = 0; i < arguments.length; i++) {
      try {
        long target = Long.parseLong(arguments[i]);
        finders[i] = new PrimeFinder(target);
        finders[i].start();
        System.out.println("Looking for prime " + target);
      }
      catch (NegativeNumberException e) {
        System.out.println("Invalid Argument " + e.getMessage());
      }
       catch (NumberFormatException e) {
        System.out.println("Argument " + arguments[i] + " is not a number.");
      }
    }
    boolean finished = false;
    while (!finished) {
      finished = true;
      for (int i = 0; i < finders.length; i++) {
        if (finders[i] == null)
          continue;
        if (!finders[i].finished)
          finished = false;
        else {
          displayResult(finders[i]);
          finders[i] = null;
        }
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
    }
  }

  private void displayResult(PrimeFinder finder) {
    System.out.println("Prime " + finder.target
        + " is " + finder.prime);
  }
}
