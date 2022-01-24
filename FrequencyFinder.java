import java.util.Arrays;

public class FrequencyFinder {
    public static void main(String[] args) {
        int[] arrayToTest = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arrayToTest);

        int checkingElement = arrayToTest[0];
        int counter = 1;

        for (int i = 1; i < arrayToTest.length; i++) {
            if (arrayToTest[i] == checkingElement) {
                counter++;
            } else {
                System.out.println(checkingElement + " is repeated " + counter + " times.");
                checkingElement = arrayToTest[i];
                counter = 1;
            }
        }
        System.out.println(checkingElement + " is repeated " + counter + " times.");
    }
}

/*

Output:

5 is repeated 1 times.
10 is repeated 3 times.
20 is repeated 4 times.

*/
