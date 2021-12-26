import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.print("Exponent: ");
        int exponent = input.nextInt();

        System.out.print(number + "^" + exponent + " = ");

        if (exponent == 0 && number == 0) {
            System.out.print("Undefined.");
        } else if (exponent >= 0) {
            System.out.print(pow(number, exponent));
        } else {
            System.out.println(powDouble(number, exponent));
        }
    }

    static int pow(int n, int m) {
        int result;

        if (n == 0) {
            return 0;
        }

        if (m == 0) {
            return 1;
        } else {
            result = n * pow(n, m - 1);
        }

        return result;
    }

    static double powDouble(int x, int y) {
        double resultDouble;
        y *= -1;

        if (x == 0) {
            return 0;
        }

        if (y == 0) {
            return 1;
        } else {
            resultDouble = x * (double)(pow(x, y - 1));
        }

        resultDouble = 1 / resultDouble;
        return resultDouble;
    }
}

/*

Sample Outputs:
5^2 = 25

3^0 = 1

0^3 = 0

0^0 = Undefined.

5^-2 = 0.04

*/
