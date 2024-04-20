package java21days;

import java.util.StringTokenizer;

public class DateMonthYear {
  public static void main(String[] args) {
    String dateString = "12/31/2021";
    System.out.println("The date string is " + dateString);
    StringTokenizer st = new StringTokenizer(dateString, "/");
    String month = st.nextToken();
    String date = st.nextToken();
    String year = st.nextToken();
    System.out.println("Date: " + date + " Month: " + month + " Year: " + year);
  } 
}
