import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Please provide an odd number (min. 3): ");
            number = input.nextInt();
        } while (number < 3);

        int midPoint = (number / 2);
        int counter = 0;
        int space = 0;

        for (int i = 0; i <= midPoint; i++) {

            for (int j = 1; j <= (midPoint - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
            counter++;
            space++;
        }

        int tempCount = counter - 1;

        for (int l = 1; counter - l >= 1; l++) {

            for (int m = 0; m <= (counter - space); m++) {
                System.out.print(" ");

            }
            space--;

            for (int n = 1; n < tempCount * 2; n++) {
                System.out.print("*");
            }

            tempCount--;
            System.out.println();
        }
    }
}

/*

Input:
7

Output:

   *
  ***
 *****
*******
 *****
  ***
   *

*/
