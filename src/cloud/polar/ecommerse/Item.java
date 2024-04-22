package cloud.polar.ecommerse;

import java.util.Optional;

public class Item implements Comparable<Object> {
  private String id;
  private String name;
  private double retail;
  private int quantity;
  private double price;
  private boolean noDiscount;

  Item(String id, String name, String retail, String q, Optional<String> noDiscount) {
    this.id = id;
    this.name = name;
    this.retail = Double.parseDouble(retail);
    this.quantity = Integer.parseInt(q);
    this.noDiscount = Boolean.parseBoolean(noDiscount.orElse("false"));
    if (this.noDiscount) {
      this.price = this.retail;
    } else {
      if (quantity > 400)
        this.price = this.retail * .5D;
      else if (quantity > 200)
        this.price = this.retail * .6D;
      else
        this.price = this.retail * .7D;
      this.price = Math.floor(this.price * 100 + .5) / 100;
    }
  }

  public int compareTo(Object obj) {
    Item temp = (Item) obj;
    if (this.price < temp.price) {
      return 1;
    } else if (this.price > temp.price) {
      return -1;
    }
    return 0;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getRetail() {
    return retail;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPrice() {
    return price;
  }

}
