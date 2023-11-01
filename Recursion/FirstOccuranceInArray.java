package Recursion;

public class FirstOccuranceInArray {
    
     public static int findFirstOccurrence(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;                         // Base case: Element not found in the array.
        }

        if (arr[index] == target) {                // Element found, return the index.                             
            return index;                       
        }

        return findFirstOccurrence(arr, target, index + 1);    // Recursively search for the element in the rest of the array.
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5}; 
        int target = 29;

        int firstOccurrence = findFirstOccurrence(arr, target, 0);

        if (firstOccurrence == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("The first occurrence of " + target + " is at index " + firstOccurrence);
        }
    }

   
}
