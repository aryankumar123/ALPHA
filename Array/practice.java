package Array;
import java.util.*;


public class practice {
    static int countOccurence(int[] arr , int x){
        int count = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
   
        // int[] arr = {2,5,6,7};
        // System.out.println(countOccurence(arr,3));
        
        int[] arr = {4, 4, 1, 2, 1, 2, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

}
