// write a program to find min and max values out of N values.

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to compare: ");
        int numbersToCompare = input.nextInt();
        int counter = 1, min = 0, max = 0;

        if (numbersToCompare > 0) {
            System.out.print("Number " + counter + ": ");
            int temp = input.nextInt();
            min = temp;
            max = temp;


            while (counter < numbersToCompare) {
                counter++;

                System.out.print("Number " + counter + ": ");
                temp = input.nextInt();

                if (temp < min) {
                    min = temp;
                } else if ( temp > max) {
                    max = temp;
                }
            }

            System.out.println("Min: " + min + ", Max: " + max);
            
        } else {
            System.out.println("Failed.");  
        }
    }
}

/*
Input:

How many numbers do you want to compare: 5
Number 1: 0
Number 2: -5
Number 3: 3
Number 4: 4
Number 5: 5

Output:

Min: -5, Max: 5
*/
