import java.util.Arrays;

public class TransposedMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{2,3,4},{5,6,4}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(transpose(matrix1)));
        System.out.println(Arrays.deepToString(transpose(matrix2)));
    }

    static int[][] transpose(int[][] arr) {
        int[][] transposedMatrix = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposedMatrix[j][i] = arr[i][j];
            }
        }

        return transposedMatrix;
    }
}
