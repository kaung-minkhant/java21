package com.java21days;

import java.awt.Point;

class FourDPoint extends Point {
  int z, w;

  FourDPoint(int x, int y, int z, int w) {
    super(x, y);
    this.z = z;
    this.w = w;
  }

  void showPoint() {
    new InstanceCounter();
    System.out.println("Count is " + InstanceCounter.getCount());
    System.out.format("Point is x: %d, y: %d, z: %d, w: %d.%n", x, y, z, w);
  }

  public static void main(String[] args) {
    Point pOriginal = new Point(1,2);
    FourDPoint p4D = (FourDPoint) pOriginal;
    p4D.showPoint();
    FourDPoint p = new FourDPoint(10, 20, 30, 40);
    p.showPoint();
  }
}

class FiveDPoint extends FourDPoint {
  int t = 0;
  FiveDPoint(int x, int y, int z, int w, int t) {
    super(x, y, z, w);
    this.t = t;
  }  
  void show5DPoint() {
    new InstanceCounter();
    System.out.println("Count is " + InstanceCounter.getCount());
    System.out.format("Point is x: %d, y: %d, z: %d, w: %d, t: %d.%n", x, y, z, w, t);
  }
  public static void main(String[] args) {
    FourDPoint p4D = new FourDPoint(1,2, 3, 4);
    FiveDPoint p5D = (FiveDPoint) p4D;
    p5D.show5DPoint();
  }
}

class A {
    void methodA() {
        System.out.println("Method A in class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Method B in class B");
    }
}

class Main {
    public static void main(String[] args) {
        A objA = new B(); // Superclass reference pointing to subclass object
        objA.methodA(); // Accessing method from superclass
        // objA.methodB(); // This line would cause a compilation error since methodB() is not available in class A

        // Downcasting to access subclass-specific methods
        if (objA instanceof B) {
            B objB = (B) objA; // Explicit casting
            objB.methodB(); // Accessing method from subclass
        }
    }
}