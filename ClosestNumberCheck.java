// Write a program that finds closest two numbers (lower and higher) to user input.

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please provide a number to check: ");
        int userInput = input.nextInt();

        int[] array = {56,34,1,8,101,-2,-33};
        System.out.println(array.length);

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);


/*

        int lowerClosest, higherClosest;

        for (int i : array) {

        }
*/

    }
}
