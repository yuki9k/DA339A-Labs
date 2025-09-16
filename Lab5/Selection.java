import java.util.Scanner;

public class Selection {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    while (!sc.hasNextInt()) {
      System.out.println("Please enter a valid integer.");
      sc.next();
    }

    n = sc.nextInt();

    if (n < 0) {
      System.out.println("Number is below 0");
    } else if (n == 7) {
      System.out.println("Number is 7!");
    } else if (n == 6) {
      System.out.println("Number is 6!");
    } else if ((n > 1 && n < 4) || (n > 7 && n < 9)) {
      System.out.println("Number is either between 1 and 4, or 7 and 9!");
      if (n == 3) {
        System.out.println("Number is 3!");
      }
    } else if (n > 10) {
      System.out.println("Number is bigger than 10!");
      if (n > 67) {
        System.out.println("Number is bigger than 67!");
      } else if (n > 25 && n < 50) {
        System.out.println("Number is between 25 and 50!");
      }
    }

    sc.close();
  }
}
