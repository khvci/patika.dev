public class TransposedMatrix {
    public static void main(String[] args) {

    }

    static int[][] transpose(int[][] arr) {
        int[][] transposedMatrix = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposedMatrix[j][i] = arr[i][j];
            }
        }

        return transposedMatrix;
    }
}
