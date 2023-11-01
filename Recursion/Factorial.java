package Recursion;

public class Factorial {
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;                                              // 0! is defined as 1
        } 
        else {
            return n * calculateFactorial(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
}
