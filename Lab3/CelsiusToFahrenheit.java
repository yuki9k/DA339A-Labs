import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float c;
    float f;
    System.out.println("Detta program konverterar Celsisu till Fahrenheit!");
    System.out.print("Ange temperatur i Celsius: ");

    while (!sc.hasNextFloat()) {
      System.out.println("Vänligen ange ett numeriskt värde.");
      sc.next();
    }

    c = sc.nextFloat();
    f = (c * 9 / 5) + 32;
    System.out.println(c + " celsius => " + f + " fahrenheit");
    System.out.printf("%.2f celsius => %.2f fahrenheit", c, f);
    sc.close();
  }
}
