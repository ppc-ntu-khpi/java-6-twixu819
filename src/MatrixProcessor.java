import java.util.Arrays;

public class MatrixProcessor {

    public static int calculateSum(int[][] matrix) {
        int total = 0;

        for (int[] row : matrix) {
            total += Arrays.stream(row).sum();
        }

        return total;
    }
}