import java.util.Scanner;

public class Ticket {
  public static void main(String args[]) {
    final float TICKET_PRICE_ADULT = 100.0f;
    final float TICKET_PRICE_CHILD = TICKET_PRICE_ADULT * 0.75f;

    final Scanner sc = new Scanner(System.in);
    String customerName = "";
    int noOfAdults = 0;
    int noOfChildren = 0;
    float adultsTotalPrice = 0.0f;
    float childrenTotalPrice = 0.0f;
    float finalPrice = 0.0f;
    System.out.printf(
        "[Welcome to TicketMachine 3000]\nTicket Prices:\nAdult - %.2fkr\nChild - %.2fkr\n",
        TICKET_PRICE_ADULT, TICKET_PRICE_CHILD);

    while (true) {
      System.out.printf("Please enter your name: ");
      customerName = sc.nextLine();

      if (!customerName.trim().isEmpty()) {
        break;
      }

      System.out.printf("Name cannot be empty...\n");
    }

    System.out.printf("Please enter the amount of adults: ");
    while (!sc.hasNextInt()) {
      System.out.printf("Input has to be numeric!\nPlease enter the amount of adults: ");
      sc.next();
    }

    noOfAdults = sc.nextInt();

    System.out.printf("Please enter the amount of children: ");
    while (!sc.hasNextInt()) {
      System.out.printf("Input has to be numeric!\nPlease enter the amount of children: ");
      sc.next();
    }

    noOfChildren = sc.nextInt();
    adultsTotalPrice = noOfAdults * TICKET_PRICE_ADULT;
    childrenTotalPrice = noOfChildren * TICKET_PRICE_CHILD;
    finalPrice = adultsTotalPrice + childrenTotalPrice;

    System.out.printf(
        "\nPurchase successful!\n\nTICKET\nName: %s\nTicket (Adult) - %.2fkr (%dx%.2fkr)\nTicket (Child) - %.2fkr (%dx%.2fkr)\nTotal: %.2fkr\n",
        customerName, adultsTotalPrice, noOfAdults, TICKET_PRICE_ADULT,
        childrenTotalPrice, noOfChildren, TICKET_PRICE_CHILD, finalPrice);
    sc.close();
  }
}
