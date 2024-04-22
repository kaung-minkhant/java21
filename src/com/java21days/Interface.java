package com.java21days;

interface SimpleInterface {
  public abstract void methodA(SimpleInterface self);
}

class ClassImplementsInterface implements SimpleInterface {
  int a = 10;
  public void methodA(SimpleInterface self) {
    ClassImplementsInterface me = (ClassImplementsInterface) self; 
    System.out.println("This is a method from object of class " + me.getClass().getName() + " and it has value of z: " + me.a);
  }

  public static void main(String[] args) {
    ClassImplementsInterface obj = new ClassImplementsInterface();
    obj.methodA(obj);
  }
}