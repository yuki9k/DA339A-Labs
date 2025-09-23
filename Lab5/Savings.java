import java.util.Scanner;

public class Savings {
  public static void main(String args[]) {
    int amount, weeks, totalSavings;
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter the amount (kr) to save each week: ");

      if (sc.hasNextInt()) {
        amount = sc.nextInt();
        if (amount > 0) {
          break;
        }
      } else {
        sc.next();
      }

      System.out.println("Please enter a number more than 0");
    }

    while (true) {
      System.out.print("Enter how many weeks to save for: ");

      if (sc.hasNextInt()) {
        weeks = sc.nextInt();
        if (weeks > 0) {
          break;
        }
      } else {
        sc.next();
      }

      System.out.println("Please enter a number more than 0");
    }

    totalSavings = amount * weeks;

    if (totalSavings >= 5000) {
      System.out.println("You're a good saver! You've earned a 100kr bonus.");
      totalSavings += 100;
    } else if (totalSavings >= 2500) {
      System.out.println("You're a good saver! You've earned a 50kr bonus.");
      totalSavings += 50;
    } else {
      System.out.println("You're not a good saver :(");
    }

    System.out.println("Your total savings amount to: " + totalSavings + "kr");

    sc.close();
  }
}
