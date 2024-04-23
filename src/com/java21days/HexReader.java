package com.java21days;

public class HexReader {
  String[] input = {
      "000A110D1D260219",
      "78700F1318141E0C",
      "6A197D45B0FFFFFF"
  };

  public static void main(String[] args) {
    HexReader hr = new HexReader();
    for (int i = 0; i < hr.input.length; i++) {
      hr.readHex(hr.input[i]);
    }
  }

  void readHex(String input) {
    try {
      for (int i = 0; i + 1 < input.length(); i += 2) {
        String hexString = input.substring(i, i + 2);
        int hex = Integer.parseInt(hexString, 16);
        if (hex == 255) {
          return;
        }
        System.out.print(hex + " ");
      }
    } finally {
      System.out.println("**");
    }
  }

}
