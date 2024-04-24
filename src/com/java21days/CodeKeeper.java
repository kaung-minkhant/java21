package com.java21days;

import java.util.ArrayList;
import java.util.Iterator;

public class CodeKeeper {
  private ArrayList<String> codes; 
  private String[] systemCodes = {"hi", "hello"};

  CodeKeeper(String[] userCodes) {
    codes = new ArrayList<String>();
    for (int i = 0; i < systemCodes.length; i++) {
      addCode(systemCodes[i]);
    }

    for (int i = 0; i < userCodes.length; i++) {
      addCode(userCodes[i]);
    }

    System.out.print("The codes are ");
    for (Iterator<String> i = codes.iterator(); i.hasNext();) {
      System.out.print(i.next() + " ");
    }
    System.out.println();
  }

  public void showCodes() {
    System.out.print("The codes are ");
    for (String i : codes) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  private void addCode(String code) {
    if (!codes.contains(code)) {
      codes.add(code);
    }
  }

  public static void main(String[] args) {
    CodeKeeper ck = new CodeKeeper(args);  
    ck.showCodes();
  }
}
