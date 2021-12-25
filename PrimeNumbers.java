// Write a program that prints prime numbers up to N.

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give an N value to check: ");
        int number = input.nextInt();

        if (number > 1) {
            System.out.print("Prime numbers up to " + number + ": ");

            for (int i = 2; i <= number; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("Lowest prime number is 2, which is bigger than your N.");
        }
    }

    static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
Input:
100

Output:
Prime numbers up to 100: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

Input:
1

Output:
Lowest prime number is 2, which is bigger than your N.
*/
