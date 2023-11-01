package Recursion;

public class PrintXToPowerN {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1; 
        } 
        return  a * power(a, n - 1);         
    }


    public static int OptimisedPower(int a, int n) {
        if (n == 0) {
            return 1; 
        } 
        int halfPower = OptimisedPower( a,  n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0 ){                                    // if   n is odd
            halfPowerSq = a * halfPowerSq;
        }
        return  halfPowerSq;         
    }


    public static void main(String[] args) {
        System.out.println(power(2, 5));
        System.out.println(OptimisedPower(2, 5));
    }

   
}
