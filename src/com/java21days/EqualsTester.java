package com.java21days;

public class EqualsTester {
  public static void main(String[] args) {
    String s1, s2;
    s1 = "This is a string"; 
    s2 = s1;

    System.out.println("String 1: " + s1);
    System.out.println("String 2: " + s2);
    System.out.println("Same Object?: " + (s1 == s2));

    // s2 = new String(s1);
    s2 = "This is a string";
    System.out.println("\nString 1: " + s1);
    System.out.println("String 2: " + s2);
    System.out.println("Same Object?: " + (s1 == s2));
    System.out.println("Same value?: " + s1.equals(s2));
  } 
}
