package java21days;

public class Calendar {
  public static void main(String[] args) {
    int yearIn = 2024;
    if (args.length > 0) {
      yearIn = Integer.parseInt(args[0]);
    }
    System.out.println("Calendar for year " + yearIn + "\n");

    for (int month = 0; month < 12; month++) {
      int numDays = DayCounter.getNumberOfDays(month + 1, yearIn);
      System.out.println(getMonth(month) + ":");
      for (int day = 1; day <= numDays; day++) {
        System.out.print(day + " ");
        if (day % 7 == 0) {
          System.out.print('\n');
        }
      }
      System.out.println();
      System.out.println();
    }
  }

  static String getMonth(int month) {
    switch (month) {
      case 0:
        return "January";
      case 1:
        return "February";
      case 2:
        return "March";
      case 3:
        return "April";
      case 4:
        return "May";
      case 5:
        return "June";
      case 6:
        return "July";
      case 7:
        return "August";
      case 8:
        return "September";
      case 9:
        return "October";
      case 10:
        return "November";
      case 11:
        return "December";
      default: 
        return "January";
    }
  }
}
