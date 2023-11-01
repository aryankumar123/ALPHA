package Recursion;

public class LastOccuranceInArray {

     public static int findLastOccurrence(int[] arr, int target, int index) {
        if (index < 0) {                // Base case: Element not found in the array.
            return -1; 
        }

        if (arr[index] == target) {     // Element found, return the index.
            return index; 
        }

        return findLastOccurrence(arr, target, index - 1);          // Recursively search for the element in the rest of the array.
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 2}; 
        int target = 2; 
        int lastOccurrence = findLastOccurrence(arr, target, arr.length - 1);

        if (lastOccurrence == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("The last occurrence of " + target + " is at index " + lastOccurrence);
        }
    }

   
}
