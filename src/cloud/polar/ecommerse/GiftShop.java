package cloud.polar.ecommerse;

import java.util.Optional;

public class GiftShop {
  public static void main(String[] arguments) {
    StoreFront store = new StoreFront();
    store.addItem("C01", "MUG", "9.99", "150", Optional.of("true"));
    store.addItem("C02", "LG MUG", "12.99", "82", Optional.empty());
    store.addItem("C03", "MOUSEPAD", "10.49", "800", Optional.of("true"));
    store.addItem("D01", "T SHIRT", "16.99", "90", Optional.empty());
    store.sort();
    for (int i = 0; i < store.getSize(); i++) {
      Item show = store.getItem(i);
      System.out.println("\nItem ID: " + show.getId() +
          "\nName: " + show.getName() +
          "\nRetail Price: $" + show.getRetail() +
          "\nPrice: $" + show.getPrice() +
          "\nQuantity: " + show.getQuantity());
    }
  }
}
