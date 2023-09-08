package Array;

public class TrappedRainWater {
   
    public static int calculateTrappedWater(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0; // Not enough bars to trap water
        }
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {3, 0, 0, 2, 0, 4};       
        int trappedWater = calculateTrappedWater(height);       
        System.out.println("Trapped rainwater: " + trappedWater + " units");
    }
}
