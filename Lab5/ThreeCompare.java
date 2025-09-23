import java.util.Scanner;

public class ThreeCompare {
  public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    while (!sc.hasNextInt()) {
      System.out.println("Please enter a valid integer.");
      sc.next();
    }

    a = sc.nextInt();

    System.out.print("Please enter the second number: ");
    while (!sc.hasNextInt()) {
      System.out.println("Please enter a valid integer.");
      sc.next();
    }

    b = sc.nextInt();

    System.out.print("Please enter the third number: ");
    while (!sc.hasNextInt()) {
      System.out.println("Please enter a valid integer.");
      sc.next();
    }

    c = sc.nextInt();

    if (a == b && b == c) {
      System.out.printf("All numbers are equal (%d)", a);
    } else {
      if (a > b && a > c) {
        System.out.printf("a (%d) is bigger than b (%d) and c (%d)", a, b, c);
      } else if (b > a && b > c) {
        System.out.printf("b (%d) is bigger than a (%d) and c (%d)", b, a, c);
      } else if (c > a && c > b) {
        System.out.printf("c (%d) is bigger than a (%d) and b (%d)", c, a, b);
      } else {
        if (a == b) {
          System.out.printf("a and b are the sime size (%d) and bigger than c (%d)", a, c);
        } else if (b == c) {
          System.out.printf("b and c are the sime size (%d) and bigger than a (%d)", b, a);
        } else if (a == c) {
          System.out.printf("a and c are the sime size (%d) and bigger than b (%d)", a, b);
        }
      }
    }
    System.out.printf("\n");
    sc.close();
  }
}
