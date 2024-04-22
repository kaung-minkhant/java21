package com.java21days;

public class HalfLooper {
  public static void main(String[] args) {
    int[] denver = {1000, 20000, 4000};
    int [] phil = {10200, 112000, 45401};
    int[] total = new int[denver.length];
    int sum = 0;

    for (int i = 0; i < denver.length; i++) {
      total[i] = denver[i] + phil[i];
      System.out.format("Year %d production is %,d%n", i + 1, total[i]);
      sum = sum + total[i];
    }

    System.out.println("Average prouction is " + sum/denver.length);
  } 
}
