package com.java21days;

import java.util.BitSet;

public class HolidaySked {
  private BitSet sked; 

  HolidaySked() {
    sked = new BitSet(365);
    int[] holidays = {1,4,100, 300};
    for (int i = 0; i < holidays.length; i++) {
      sked.set(holidays[i]);
    }
  }

  boolean isHoliday(int day) {
    return sked.get(day); 
  }

  public static void main(String[] args) {
    HolidaySked hs = new HolidaySked();
    for (int i = 0; i < args.length; i++) {
      try {
        int dayToTest = Integer.parseInt(args[i]);
        if (hs.isHoliday(dayToTest)) {
          System.out.format("Day %d is a holiday.%n", dayToTest);
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid argument " + args[i]);
      }
    }
  }
}
