package Array2D;

public class SpiralMatrix {
    static void printSpiral(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {
            for (int i= left; i <= right; i++) {
                System.out.println(matrix[top][i]);
            }
            top++;

            for (int i = top + 1; i <= bottom; i++) {
                System.out.println(matrix[i][right]);
            }
            right--;

            for (int i = right - 1; i >= left; i--) {
                System.out.println(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom - 1; i >= top + 1; i--) {        
                System.out.println(matrix[i][left]);
            }
            left++;

        }
    }

    public static void main(String args[]) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        printSpiral(matrix);
        // printSpiralMatrix(matrix);
    }

    public static void printSpiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row (if not the same as top row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column (if not the same as right column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

}
