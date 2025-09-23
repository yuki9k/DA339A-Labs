import java.util.Scanner;

public class Cure {
  public static void main(String args[]) {
    int input;
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Please enter a number representing a week day: ");

      if (sc.hasNextInt()) {
        input = sc.nextInt();
        if (input >= 1 && input <= 7) {
          break;
        }
      } else {
        sc.next();
      }

      System.out.println("Please enter a valid number (1-7)");
    }

    switch (input) {
      case 1:
        System.out.println("Monday, you can fall apart");
      case 2:
        System.out.println("Tuesday");
      case 3:
        System.out.println("Wednesday, break my heart");
      case 4:
        System.out.println("Oh, Thursday doesn't even start");
      case 5:
        System.out.println("It's Friday, I'm in love");
      case 6:
        System.out.println("Saturday, wait");
        break;
      case 7:
        System.out.println("And Sunday always comes too late");
        break;
    }

    sc.close();
  }
}
