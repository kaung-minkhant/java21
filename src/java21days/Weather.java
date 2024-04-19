package java21days;

public class Weather {
  public static void main(String[] args) {
    float fehr = 64;
    // int cels = (fehr - 32) * 5 / 9;
    System.out.print(fehr + " Fehrenheit in Celsius is ");
    fehr = fehr - 32;
    fehr = fehr * 5;
    fehr = fehr / 9;
    System.out.println(fehr);

    float celc = 17.777779F;
    System.out.print(celc + " Celsius in Fehrenheit is "); 
    celc = celc * 9;
    celc = celc / 5;
    celc = celc + 32;
    System.out.println(celc);
  }  
}
