//write a program that finds even duplicates in an array.

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateEvenNumbers {
    public static void main(String[] args) {
        int[] arrayToCheck = {12, -2, 3, 12, -2, 1, 2, 3, 5, 2, 7, 9, 11, 0, 2, 6, 5, 22, 4, 6, 7, 8, 8, 12};

        ArrayList<Integer> newArray = new ArrayList<>();
        ArrayList<Integer> duplicateItems = new ArrayList<>();

        for (int i: arrayToCheck) {
            if (!newArray.contains(i)) {
                newArray.add(i);
            } else {
                if (i % 2 == 0 && !duplicateItems.contains(i)) {
                    duplicateItems.add(i);
                }
            }
        }

        System.out.println("Array to check: " + Arrays.toString(arrayToCheck));
        System.out.println("Duplicate even items are: " + duplicateItems);

    }
}

/*

Sample Output:

Array to check: [12, -2, 3, 12, -2, 1, 2, 3, 5, 2, 7, 9, 11, 0, 2, 6, 5, 22, 4, 6, 7, 8, 8, 12]
Duplicate even items are: [12, -2, 2, 6, 8]

 */
