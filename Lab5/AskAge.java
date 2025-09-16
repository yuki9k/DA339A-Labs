import java.util.Scanner;

public class AskAge {
  public static void main(String args[]) {
    int age;
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Please enter your age: ");

      if (sc.hasNextInt()) {
        age = sc.nextInt();
        if (age > 0) {
          break;
        }
      } else {
        sc.next();
      }

      System.out.println("Please enter a valid age (>0)");
    }
    System.out.println(age <= 17 ? "You're a child" : "You're an adult");
    sc.close();
  }
}
