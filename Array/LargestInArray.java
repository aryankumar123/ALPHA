package Array;

public class LargestInArray {
    public static int findLargestElement(int[] array) {
        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 12, 7, 3 };
        
        int largest = findLargestElement(numbers);
        System.out.println("The largest element in the array is: " + largest);
    }
}
