

package Sorting;

public class CountingSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // Find the maximum and minimum values in the input array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Create a count array to store the count of each element
        int[] countArray = new int[max - min + 1];

        // Calculate the count of each element in the input array
        for (int i = 0; i < n; i++) {
            countArray[arr[i] - min]++;
        }

        // Reconstruct the sorted array from the count array
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                arr[index] = i + min;
                index++;
                countArray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 163, 55, 457, 210, 912, 15, 158 };
        sort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

