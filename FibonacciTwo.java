// Write a program that prints first N fibonacci numbers.

import java.util.Scanner;

public class FibonacciTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1;

        System.out.print("Please give a number: ");
        int number = input.nextInt();

        if (number > 1) {
            System.out.print("First " + number + " fibonacci numbers: ");

            for (int i = 0; i < number; i++) {
                System.out.print(a + " ");
                int total = a + b;
                a = b;
                b = total;
            }
        } else if (number == 1) {
            System.out.print("First fibonacci number: 0");
        } else {
                System.out.println("Please provide a positive number.");
        }
    }
}

/*

Input:
10

Output:
First 10 fibonacci numbers: 0 1 1 2 3 5 8 13 21 34 

 */
