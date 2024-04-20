package java21days;

public class StringChecker {
  public static void main(String[] args) {
    String str = "this is an example string";
    System.out.println("The string is: " + str);
    System.out.println("The length of the string is " + str.length());
    System.out.println("The character at position 6 is " + str.charAt(6));
    System.out.println("The substring from position 5 to 10 is " + str.substring(5, 10));
    System.out.println("The index of the first e is " + str.indexOf('e'));
    System.out.println("The index of the beginning of the substring \"example\" is " + str.indexOf("example"));
    System.out.println("The string in uppercase is " + str.toUpperCase());
    System.out.format("Balance is $%,.2f\n", 50000.56F);
  }  
}
