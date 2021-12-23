// In mathematics, the Nth harmonic number is the sum of the reciprocals of the first N natural numbers.

// Write a program that calculates Nth Harmonic Number.


import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.print("N: ");
        int number = input.nextInt();

        for (double i = 1; i <= number; i++) {
            total += (1 / i);
        }

        if (number < 1) {
            System.out.println("Please provide a positive number.");
        } else if ( number % 10 == 1) {
            System.out.print(number + "st Harmonic Number is: " + total);
        } else if (number % 10 == 2 && number % 100 != 12) {
            System.out.print(number + "nd Harmonic Number is: " + total);
        } else if (number % 10 == 3 && number % 100 != 13) {
            System.out.print(number + "rd Harmonic Number is: " + total);
        } else {
            System.out.print(number + "th Harmonic Number is: " + total);
        }
    }
}
