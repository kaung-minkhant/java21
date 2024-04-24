package com.java21days;

import java.util.HashMap;

public class ComicBooks {
  private HashMap<String, Float> conditionMap;
  private Comic[] comix;

  ComicBooks() {
    conditionMap = new HashMap<String, Float>();
    conditionMap.put("mint", 3.00F);
    conditionMap.put("near mint", 2.00F);
    conditionMap.put("very fine", 1.50F);
    conditionMap.put("fine", 1F);

    comix = new Comic[1];
    comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine",12_000.00F);
    comix[0].setPrice(conditionMap.get("very fine"));
  }

  void showComix() {
    for (int i = 0; i < comix.length; i++) {
      System.out.format("%s price is %,.2f%n", comix[i].title, comix[i].price);
    } 
  }

  public static void main(String[] args) {
    ComicBooks cb = new ComicBooks();
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
