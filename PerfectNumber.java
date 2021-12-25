/* Definition: A Perfect Number N is defined as any positive integer where the sum
of its divisors minus the number itself equals the number. The first few
of these, already known to the ancient Greeks, are 6, 28, 496, and 8128. */

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Which number do you want to check?: ");
        int number = input.nextInt();

        if (number > 0) {
            int tempTotal = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    tempTotal += i;
                }
            }

            if (tempTotal == number) {
                System.out.print(number + " is a perfect number.");
            } else {
                System.out.print(number + " is not a perfect number.");
            }
        } else {
            System.out.println("Please provide a positive number.");
        }
    }
}
