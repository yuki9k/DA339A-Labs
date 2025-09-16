import java.util.Scanner;

public class Cakes {
  public static void main(String args[]) {
    int cakeSize;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a cake size: ");
    while (!sc.hasNextInt()) {
      System.out.println("Please enter a valid size (>0).");
      sc.next();
    }

    cakeSize = sc.nextInt();

    System.out.println(cakeSize % 3 == 0 ? "Cake is evenly divisible by 3!"
        : "Cake is not evenly divisible by 3!");

    System.out.println(cakeSize % 4 == 0 ? "Cake is evenly divisible by 4!"
        : "Cake is not evenly divisible by 4!");

    if (cakeSize % 10 == 7) {
      System.out.println("Ones digit is 7!");
    }

    if ((cakeSize >= 100) && ((cakeSize / 100) % 10 == 7)) {
      System.out.println("Hundreds digit is 7!");
    }

    sc.close();
  }
}
