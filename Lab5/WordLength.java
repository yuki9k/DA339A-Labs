import java.util.Scanner;

public class WordLength {
  public static void main(String args[]) {
    String input;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a word: ");

    input = sc.nextLine();
    String[] words = input.split("\\s+");
    for (String word : words) {
      System.out.printf("The word '%s' has %d characters\n", word, word.length());
    }

    sc.close();
  }
}
