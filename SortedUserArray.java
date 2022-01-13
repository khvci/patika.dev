// write a program that takes user input as array length and the items. print sorted array to console.

import java.util.Arrays;
import java.util.Scanner;

public class SortedUserArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many items will be in your array? ");

        int[] userArray = new int[input.nextInt()];

        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            userArray[i] = input.nextInt();
        }

        Arrays.sort(userArray);
        System.out.println(Arrays.toString(userArray));
    }
}

/*

Sample input:

How many items will be in your array? 6
Item 1: 1000221
Item 2: 22
Item 3: -1
Item 4: 999
Item 5: 0
Item 6: 254

Output:

[-1, 0, 22, 254, 999, 1000221]


 */