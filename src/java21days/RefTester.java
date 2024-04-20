package java21days;

import java.awt.Point;

public class RefTester {
  public static void main(String[] args) {
    Point pt1, pt2; 
    pt1 = new Point(100, 200);
    pt2 = pt1;

    pt1.x = 200;
    pt1.y = 100;
    System.out.println("Point 1: " + pt1.x + ", " + pt1.y);
    System.out.println("Point 2: " + pt2.x + ", " + pt2.y);
    int a = 5;
    int b = 2;
    float result = ( float ) a /  ( float ) b;
    System.out.println("Result: " + result);
    Integer x = Integer.valueOf(10000);
    Float f = Float.valueOf(4.5F);
    float fValue = f.floatValue();
    int y = x.intValue();
    String something = "65000";
    int intSomething = Integer.parseInt(something);
    System.out.println("Result: " + intSomething);
  } 
}
