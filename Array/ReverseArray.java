package Array;
import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Original array: " + Arrays.toString(numbers));

        reverseArray(numbers);

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}
