package java21days;

import java.awt.Point;
public class Box {
  int x1 = 0;
  int y1 = 0;
  int x2 = 0;
  int y2 = 0;

  
  Box buildBox(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    return this; 
  }

  Box buildBox(Point topleft, Point bottomright) {
    this.x1 = topleft.x;
    this.y1 = topleft.y;
    this.x2 = bottomright.x;
    this.y2 = bottomright.y;
    return this; 
  }

  Box buildBox(Point topleft, int w, int h) {
    return buildBox(topleft.x, topleft.y, topleft.x + w, topleft.y + h);
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
    Box b = new Box();
    b.buildBox(1, 2, 3, 4).printBox(); 

    b.buildBox(new Point(0, 0), new Point(5,5)).printBox();;

    b.buildBox(new Point(0,0), 10, 10).printBox();
  }
}
