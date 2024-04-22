package com.java21days;

class Printer {
  int x;
  int y;

  Printer(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void printMe() {
    System.out.println("X is " + x + " and Y is " + y);
    System.out.println("The class name of this object is " + this.getClass().getName());
  }
}

class SubPrinter extends Printer {
  int z = 2;

  SubPrinter() {
    super(1, 5);
  }

  void printMe() {
    System.out.println("X is " + x + " and Y is " + y + " and Z is " + z);
    System.out.println("The class name of this object is " + this.getClass().getName());
  }

  public static void main(String[] args) {
    SubPrinter obj = new SubPrinter();
    obj.printMe();
  }
}