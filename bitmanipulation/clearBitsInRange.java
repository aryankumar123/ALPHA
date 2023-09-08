
// here we divide in two steps  
// let take n =100111010011, i =2, j=7

// we need bitmask = 111100000011

// wee divide bitmask in two step where a = 111100000000   = (~0)<<j+1  ; b = 000000000011 = (1<<i) - 1
// because we have formula a<<b = a* 2powb


public class clearBitsInRange {


    static int clearBitsInRange(int n ,int i , int j){
        int  a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask =  a|b;

        return n & bitmask ;
    }
    public static void main(String[] args) {

        System.out.println(clearBitsInRange(10 , 2 ,1));
        
        System.out.println(clearBitsInRange(10 , 2 ,4));
        
        System.out.println(clearBitsInRange(10 , 4,1 ));
    }
    
}