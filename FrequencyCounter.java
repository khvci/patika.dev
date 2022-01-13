// write a program to count how many times an item is repeated in an array.

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 20, 10, 10, 20, 5, 20};

        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i : myArray) {
            if (!counter.containsKey(i)) {
                counter.put(i, 1);
            } else {
                counter.put(i, counter.get(i) + 1);
            }
        }

        for (int i: counter.keySet()) {
            System.out.println(i + " is repeated by " + counter.get(i) + " times.");
        }
    }
}

/*

Output:

20 is repeated by 4 times.
5 is repeated by 1 times.
10 is repeated by 3 times.

 */