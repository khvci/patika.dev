import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int numberToGuess = random.nextInt(100);
        int usersGuess;
        int triesLeft = 5;

        System.out.println("TEST-- numbertoguess: " + numberToGuess);
        do {
            System.out.print("You have " + triesLeft + " to guess it correctly. Your guess: ");
            usersGuess = input.nextInt();

            if (usersGuess < 0 || usersGuess > 100) {
                System.out.print("It can only be between 0 and 100. ");
            } else {
                if (usersGuess > numberToGuess) {
                    System.out.println("It's lower than " + usersGuess);
                    triesLeft--;
                } else if (usersGuess < numberToGuess) {
                    System.out.println("It's higher than " + usersGuess);
                    triesLeft--;
                }
            }
        } while (usersGuess != numberToGuess && triesLeft > 0);


        if (numberToGuess != usersGuess) {
            System.out.println("Game Over.");
        } else {
            System.out.println("Congrats! It was " + numberToGuess + " indeed!");
        }
    }
}
