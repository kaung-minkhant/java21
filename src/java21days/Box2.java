package java21days;

import java.awt.Point;
public class Box2 {
  int x1 = 0;
  int y1 = 0;
  int x2 = 0;
  int y2 = 0;
  
  Box2 (int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  Box2 (Point topleft, Point bottomright) {
    this(topleft.x, topleft.y, bottomright.x, bottomright.y);
    // this.x1 = topleft.x;
    // this.y1 = topleft.y;
    // this.x2 = bottomright.x;
    // this.y2 = bottomright.y;
    // return this; 
  }

  Box2 (Point topleft, int w, int h) {
    this(topleft.x, topleft.y, topleft.x + w, topleft.y + h); 
    // return buildBox(topleft.x, topleft.y, topleft.x + w, topleft.y + h);
    // this.x1 = topleft.x;
    // this.y1 = topleft.y;
    // this.x2 = topleft.x + w;
    // this.y2 = topleft.y + h;
    // return this;
  }

  void printBox() {
    System.out.println("Box: < " + x1 + ", " + y1 + ", " + x2 + ", " + y2 + " >"); 
  }

  public static void main(String[] args) {
    Box2 b1 = new Box2(1,2,3,4);
    b1.printBox(); 

    Box2 b2 = new Box2(new Point(0, 0), new Point(5,5));
    b2.printBox(); 
    // b.buildBox(new Point(0, 0), new Point(5,5)).printBox();;

    Box2 b3 = new Box2(new Point(0,0), 10, 10);
    b3.printBox(); 
    // b.buildBox(new Point(0,0), 10, 10).printBox();
  }
}
