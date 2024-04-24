package com.java21days;

enum Compass {
  NOTH,
  EAST,
  SOUTH,
  WEST
}

public class DirectionSetter {
  private Compass currentDirection;
  void setDirection(Compass dir)  {
    currentDirection = dir;
  }

  void showDirection() {
    System.out.println("The current direction is " + currentDirection);
  }

  public static void main(String[] args) {
    DirectionSetter ds = new DirectionSetter();
    ds.setDirection(Compass.NOTH);
    ds.showDirection();
  }
}
