package Sorting;

public class InsertionSort {
    public static void sort(int[] arr) {
     
        for (int i = 1; i < arr.length; i++) {
            int currValue = arr[i];
            int prevIndex = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            //Finding correct pos to insert
            while (prevIndex >= 0 && arr[prevIndex] > currValue) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex = prevIndex - 1;
            }

            arr[prevIndex + 1] = currValue;
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
