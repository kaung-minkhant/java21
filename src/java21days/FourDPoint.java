package java21days;

import java.awt.Point;

class FourDPoint extends Point {
  int z, w;

  FourDPoint(int x, int y, int z, int w) {
    super(x, y);
    this.z = z;
    this.w = w;
  }

  void showPoint() {
    System.out.format("Point is x: %d, y: %d, z: %d, w: %d.%n", x, y, z, w);
  }

  public static void main(String[] args) {
    FourDPoint p = new FourDPoint(10, 20, 30, 40);
    p.showPoint();
  }
}
