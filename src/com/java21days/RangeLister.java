package com.java21days;

public class RangeLister {
  int[] makeRange(int lower, int higher) {
    int[] range = new int[( higher - lower ) +1];
    for (int i = 0; i < range.length; i++) {
      range[i] = lower++;
    }
    return range;
  }

  public static void main(String[] args) {
    int lower = 0;
    int higher = 5;
    if (args.length > 0) {
      lower = Integer.parseInt(args[0]);
    }
    if (args.length > 1) {
      higher = Integer.parseInt(args[1]);
    }
    // check if lower is less than higher

    int[] range;
    RangeLister rl = new RangeLister();
    range = rl.makeRange(lower, higher);
    System.out.print("The array is [ ");
    for (int i = 0; i < range.length; i++) {
      System.out.print(range[i] + " ");
    }
    System.out.println("]");
  }
}