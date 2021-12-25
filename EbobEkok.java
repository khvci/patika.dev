// HCF: Highest Common Factor (a.k.a. GCF, Greatest Common Factor)
// LCM: Least Common Multiple

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Number: ");
        int a = input.nextInt();

        System.out.print("Second Number: ");
        int b = input.nextInt();

        if (a > 0 && b > 0) {
            System.out.print("For " + a + " and " + b + ", highest common factor is " + hcf(a, b) +
                    " and least common multiple is " + lcm(a, b));
        } else {
            System.out.print("Please provide a positive number.");
        }
    }

    static int hcf(int a, int b) {
        int hcf = 1;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break;
            }
        }
        return hcf;
    }

    static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

}
