package com.java21days;

public class Investor {
  public static void main(String[] args) {
    float initial = 14_000;
    initial = initial + initial * 0.4F;
    initial = initial - 1_500;
    initial = initial + initial * 0.12F;
    System.out.println("The final amount after three year is " + initial);
  } 
}
