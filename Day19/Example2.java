import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Enter a number between 1 and 100: ");
    int userNumber = scanner.nextInt();
    int numTries = 1;

    while (userNumber < 1 || userNumber > 100) {
      if (numTries > 2) {
        System.out.println("Better luck next time!");
        return;
      }
      System.out.println("Invalid input. Please enter a number between 1 and 100.");
      System.out.print("Enter a number between 1 and 100: ");
      userNumber = scanner.nextInt();
      numTries++;
    }

    int computerNumber = rand.nextInt(101);
    System.out.println("The computer generated the number " + computerNumber);

    if (userNumber > computerNumber) {
      System.out.println("Your number is greater than the computer's number.");
    } else if (userNumber < computerNumber) {
      System.out.println("Your number is smaller than the computer's number.");
    } else {
      System.out.println("Congratulations, you guessed the correct number!");
    }
  }
}