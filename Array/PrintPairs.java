package Array;

public class PrintPairs {
    public static void printAllPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + ", " + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };

        System.out.println("All pairs in the array:");
        printAllPairs(numbers);
    }
}

