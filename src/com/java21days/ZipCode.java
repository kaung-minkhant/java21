package com.java21days;

public class ZipCode {
  private static String zipcode;

  public String getZipCode() {
    return zipcode;
  }

  public void setZipCode(String zip) {
    if (zip.length() == 5 || zip.length() == 9) {
      zipcode = zip;
    }
  }

  // too lazy to write app here to test but this is simple
}
