package com.java21days;

import java.awt.Point;

class NamedPoint extends Point {
  String name;

  NamedPoint(String name, int x, int y) {
    super(x, y);
    this.name = name;
  }

  public static void main(String[] arguments) {
    NamedPoint np = new NamedPoint("SmallPoint", 5, 5);
    System.out.println("x is " + np.x);
    System.out.println("y is " + np.y);
    System.out.println("Name is " + np.name);
  }
}
