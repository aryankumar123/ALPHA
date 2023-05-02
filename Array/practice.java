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
   
        int[] arr = {2,5,6,7};
        System.out.println(countOccurence(arr,3));
        
    }
    
}
