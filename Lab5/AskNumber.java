import java.util.Scanner;

public class AskNumber {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    while (!sc.hasNextInt()) {
      System.out.println("Please enter a valid integer.");
      sc.next();
    }

    n = sc.nextInt();
    System.out.println(
        (n > 100 ? "The number is bigger than 100"
            : n < 100 ? "The number is smaller than 100"
                : "The number is 100"));
    sc.close();
  }
}
