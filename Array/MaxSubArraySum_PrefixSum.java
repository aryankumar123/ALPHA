
package Array;

public class MaxSubArraySum_PrefixSum {
    public static void maxSubArraySum(int[] array) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0];

        // Calculate the prefix sum array
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
        
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
             
                // Calculate the subarray sum using prefix sums
                currSum = start == 0 ? currSum = prefixSum[end] : prefixSum[end] - prefixSum[start - 1];

                System.out.println(currSum);

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxsum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2, 3 ,4 ,5 };

        System.out.println("All subarrays sum of array");
        maxSubArraySum(numbers);
    }
    
}

