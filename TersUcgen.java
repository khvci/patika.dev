import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Steps: ");
        int steps = input.nextInt();
        int stars = (steps * 2 ) - 1;
        int space = 0;

        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            stars -= 2;
            System.out.println();
        }
    }
}

/*

Input:
5

Output:

*********
 *******
  *****
   ***
    *
    
 */
