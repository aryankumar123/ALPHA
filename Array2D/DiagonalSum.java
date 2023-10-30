package Array2D;

public class DiagonalSum {
    public static void main(String args[]) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 10 }
        };
        // int sum = diagonalSum(matrix);                     //brute force
        int sum = diagonalSumm(matrix);                          // optimal
        System.out.println(sum);
    }

    static int diagonalSumm(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    static int diagonalSum(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
