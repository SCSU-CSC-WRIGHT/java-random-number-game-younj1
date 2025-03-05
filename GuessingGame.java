import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int count = 0;
        int min = 1;
        int max;

        System.out.println("Number Guessing Game");
        System.out.print("Choose the difficulty 1:Easy 2:Medium 3:Hard :");
        int diff = scanner.nextInt();

        if(diff == 1) {
            max = 50;
        }
        else if (diff == 2) {
            max = 100;
        }
        else{
            max = 500;
        }

        int randomNum = random.nextInt(min, max + 1);

        System.out.println("Guess a number between 1-" + max + ": ");

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            count++;

            if (guess < randomNum) {
                System.out.println("TOO LOW Try again.");
            } else if (guess > randomNum) {
                System.out.println("TOO HIGH Try again.");
            } else {
                System.out.println("CORRECT You guessed it right!");
                System.out.println("It took you " + count + " attempts ");
            }

        } while (guess != randomNum && count <= 10);
        if (randomNum != guess){
            System.out.println("You got it wrong too many times.");
        }

        scanner.close();
    }
}