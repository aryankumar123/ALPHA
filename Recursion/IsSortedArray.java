package Recursion;

public class IsSortedArray {
     public static boolean isSorted(int[] arr, int index) {
        
        if (index >= arr.length - 1) {
            return true; // Base case: The array is considered sorted when we reach the last element.
        }

        if (arr[index] > arr[index + 1]) {
            return false; // If the current element is greater than the next element, the array is not sorted.
        }

        return isSorted(arr, index + 1); // Recursively check the next pair of elements.
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = isSorted(arr, 0);

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

   
}
