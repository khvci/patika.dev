/*

An Armstrong number is an N-digit number that is equal to the
sum of each of its digits taken to the Nth power. For example,
153 is an armstrong number because 153 = 1³ + 5³ + 3³.

Write a program that prints 3-digit Armstrong Numbers.

*/

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.print("3-digit Armstrong numbers are: " );

        for (int number = 100; number < 1000; number++) {
            int tempNumber = number;
            int powerTotal = 0;

            for (int i = 1; i <= 3; i++) {
                int lastDigit = tempNumber % 10;
                int tempPower = 1;

                for (int j = 1; j <= 3; j++) {
                    tempPower *= lastDigit;
                }

                tempNumber /= 10;
                powerTotal += tempPower;
            }

            if (number == powerTotal) {
                System.out.print(powerTotal + " ");
            }
        }
    }
}

/*

Output:
3-digit Armstrong numbers are: 153 370 371 407

*/
