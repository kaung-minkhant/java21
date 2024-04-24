package com.java21days;

import java.util.HashMap;

enum Condition {
  MINT,
  NEAR_MINT,
  VERY_FINE,
  FINE
}

public class ComicBooksEnum {
  private HashMap<Condition, Float> conditionMap;
  private Comic[] comix;

  ComicBooksEnum() {
    conditionMap = new HashMap<Condition, Float>();
    conditionMap.put(Condition.MINT, 3.00F);
    conditionMap.put(Condition.NEAR_MINT, 2.00F);
    conditionMap.put(Condition.VERY_FINE, 1.50F);
    conditionMap.put(Condition.FINE, 1F);

    comix = new Comic[1];
    comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine",12_000.00F);
    comix[0].setPrice(conditionMap.get(Condition.VERY_FINE));
  }

  void showComix() {
    for (int i = 0; i < comix.length; i++) {
      System.out.format("%s price is %,.2f%n", comix[i].title, comix[i].price);
    } 
  }

  public static void main(String[] args) {
    ComicBooksEnum cb = new ComicBooksEnum();
    cb.showComix(); 
  }
}

class Comic {
  String title;
  String issueNum;
  String condition;
  float basePrice;
  float price;

  Comic(String title, String issueNum, String condition, float basePrice) {
    this.title = title;
    this.issueNum = issueNum;
    this.condition = condition;
    this.basePrice = basePrice;
  }

  void setPrice(float factor) {
    price = basePrice * factor;
  }
}
