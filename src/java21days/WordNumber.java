package java21days;

public class WordNumber {
  public static void main(String[] args) {
    String word = "one";
    if (args.length > 0) {
      word = args[0];
    }
    long num = 0;
    switch (word.charAt(0)) {
      case 'o':
        num = 1L;
        break;
      case 't':
        if (word.charAt(1) == 'w') num = 2L;
        else if (word.charAt(1) == 'h') num = 3L;
        else if (word.charAt(1) == 'e') num = 10L;
        break;
      case 'f':
        if (word.charAt(1) == 'o') num = 4L;
        else if (word.charAt(1) == 'i') num = 5L;
        break;
      case 's':
        if (word.charAt(1) == 'i') num = 6L;
        else if (word.charAt(1) == 'e') num = 7L;
        break;
      case 'e':
        num = 8;
        break;
      case 'n':
        num = 9;
        break;
      default:
        num = 0L;
    }
    System.out.println("The number for " + word + " is " + num);
  } 
}
