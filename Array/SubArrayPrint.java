package Array;

public class SubArrayPrint {
    public static void printAllSubarrays(int[] array) {
        
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 ,4 ,5 };

        System.out.println("All subarrays of the array:");
        printAllSubarrays(numbers);
    }
}

