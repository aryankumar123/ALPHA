package Array;

public class MaxSubArraySum_Bruteforce {
    public static void maxSubArraySum(int[] array) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += array[k];
                }

                System.out.println(currSum);

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxsum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2, 3 ,-4 ,5 };

        System.out.println("All subarrays sum of array");
        maxSubArraySum(numbers);
    }
    
}
