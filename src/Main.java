import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
            {50, 30, 10},
            {6, 42, 60},
            {23, 8, 90}
        };

        int totalSum = MatrixProcessor.calculateSum(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("sum of elements in matrix: " + totalSum);
    }
}