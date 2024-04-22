package cloud.polar.ecommerse;

import java.util.*;
public class StoreFront {
  private LinkedList<Item> catalog = new LinkedList<Item>(); 

  public void addItem(String id, String name, String price, String quant, Optional<String> noDiscount) {
    Item it = new Item(id, name, price, quant, noDiscount);
    catalog.add(it);
  }

  public Item getItem(int index) {
    return catalog.get(index);
  }

  public int getSize() {
    return catalog.size();
  }

  public void sort() {
    Collections.sort(catalog);
  }
}
