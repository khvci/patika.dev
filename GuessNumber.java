import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int numberToGuess = random.nextInt(100);
        int usersGuess = -1;
        int usersNewGuess;
        byte triesLeft = 44;
        System.out.println(numberToGuess);

        System.out.println("Number can be between 0 and 100. Your guess: ");
        usersNewGuess = input.nextInt();

        if (usersNewGuess < 100 && usersNewGuess > 0) {
            usersGuess = usersNewGuess;
        } else {
            System.out.println("It can be between 0 and 100. Try Again.");
        }

        while (usersGuess != numberToGuess && triesLeft > 0) {
            if (usersGuess < numberToGuess) {
                System.out.println("Increase your guess. " + triesLeft + " tries left.");
                usersNewGuess = input.nextInt();
                if (usersNewGuess > usersGuess) {
                    usersGuess = usersNewGuess;
                    triesLeft--;
                } else {
                    System.out.println("You did not increase your guess. Try again.");
                }

            } else if (usersNewGuess < 100) {
                System.out.println("Decrease your guess. " + triesLeft + " tries left.");
                usersNewGuess = input.nextInt();
                if (usersNewGuess < usersGuess) {
                    usersGuess = usersNewGuess;
                    triesLeft--;
                } else {
                    System.out.println("You did not decreased your guess. Try again.");
                }
            } else {
                System.out.println("It can be between 0 and 100. Try Again.");
            }
        }

        if (usersGuess == numberToGuess) {
            System.out.println("Congrats! It was " + numberToGuess + " indeed!");
        } else {
            System.out.println("Game over.");
        }
    }
}
