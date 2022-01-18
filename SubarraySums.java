import java.util.Scanner;

public class SubarraySums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        int counter = 0;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = input.nextInt();

            int currentItem = array[i];
            if (currentItem < 0) counter++;

            for (int j = i - 1; j > 0; j--) {
                currentItem += array[j];
                if (currentItem < 0) counter++;
            }
        }
    }
}
