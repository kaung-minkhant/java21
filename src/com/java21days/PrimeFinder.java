package com.java21days;

class NegativeNumberException extends Exception {
  public NegativeNumberException(String message) {
    super(message);
  }
}
class PrimeFinder implements Runnable {
  public long target;
  public long prime;
  public boolean finished = false;
  private Thread runner;

  PrimeFinder(long target) throws NegativeNumberException {
    if (target < 0) {
      throw new NegativeNumberException("Argument cannot be negative number");
    }
    this.target = target;
    if (runner == null) {
      runner = new Thread(this);
      // runner.start();
    }
  }

  public void start() {
    runner.start();
  }

  public void run() {
    long numPrime = 1;
    long candidate = 2;
    while (numPrime <= target) {
      if (isPrime(candidate)) {
        numPrime++;
        prime = candidate;
      }
      candidate++;
    }
    finished = true;
  }

  boolean isPrime(long checkNumber) {
    double root = Math.sqrt(checkNumber);
    for (int i = 2; i <= root; i++) {
      if (checkNumber % i == 0)
        return false;
    }
    return true;
  }
}
