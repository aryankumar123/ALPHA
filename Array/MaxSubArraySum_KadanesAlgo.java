package Array;

public class MaxSubArraySum_KadanesAlgo {
    public static void maxSubArraySum(int[] array) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            currSum = currSum + array[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);             
        }
        System.out.println("maxsum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2,12, -3 ,4 ,5 };

        System.out.println("All subarrays sum of array");
        maxSubArraySum(numbers);
    }
}