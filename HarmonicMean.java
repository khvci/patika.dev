// write a program that calculates harmonic mean of an array.

public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println("Harmonic mean of array is " + harmonicMean(numbers));

    }

    static double harmonicMean(int[] arr) {
        double harmonicMean = 0;
        for (int i : arr) {
            harmonicMean += (1.0/i);
        }
        return harmonicMean;
    }
}

