// Write a program that finds closest two numbers (lower and higher) than user input.

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please provide a number to check: ");
        int userInput = input.nextInt();

        int[] array = {15,12,788,1,-1,-778,2,0};

        closestNumbers(array, userInput);
    }

    static void closestNumbers(int[] array, int userInput) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        System.out.println("Array is " + Arrays.toString(array));

        if (userInput <= sortedArray[0] || userInput >= sortedArray[sortedArray.length - 1]) {
            System.out.println("You provided a number out of range. Please provide a number between "
            + sortedArray[0] + " and " + sortedArray[sortedArray.length - 1] + " (both excluded)");
        } else {
            int lowerClosest = sortedArray[0];
            int higherClosest = sortedArray[sortedArray.length - 1];

            for (int i : sortedArray) {
                if (i < userInput) {
                    lowerClosest = i;
                }
            }

            for (int j = sortedArray.length - 1; j >= 0; j--) {
                if (sortedArray[j] > userInput) {
                    higherClosest = sortedArray[j];
                }
            }

            System.out.println("Lower closest number is " + lowerClosest);
            System.out.println("Higher closest number is " + higherClosest);
        }
    }
}
