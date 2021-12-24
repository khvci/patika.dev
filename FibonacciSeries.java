import java.util.Scanner;

public class FibonacciSeries {
    static int fib(int num) {
        if (num < 1) {
            return 0;

        } else if ( num == 1 || num == 2) {
            return 1;
        }

        int result = fib(num - 1) + fib(num -2);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please provide a positive number.");
        int number = input.nextInt();

        System.out.println(fib(number));
    }
}
