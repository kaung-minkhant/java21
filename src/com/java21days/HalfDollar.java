package com.java21days;

public class HalfDollar {
  public static void main(String[] args) {
    int[] denver = {100, 200, 300};
    int[] phil = new int[denver.length];
    int[] total = new int[denver.length];
    int average;

    phil[0] = 100;
    phil[1] = 500;
    phil[2] = 300;

    total[0] = denver[0] + phil[0];
    total[1] = denver[1] + phil[1];
    total[2] = denver[2] + phil[2];
    average = (total[0] + total[1] + total[2]) / 3;

    System.out.print("1st Production: ");
    System.out.format("%,d\n", total[0]);
    System.out.print("2nd Production: ");
    System.out.format("%,d\n", total[1]);
    System.out.print("3rd Production: ");
    System.out.format("%,d\n", total[2]);
    System.out.print("Average Production: ");
    System.out.format("%,d\n", average);
  } 
}
