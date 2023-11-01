package Recursion;

public class Fibonacci {
     public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(calculateFibonacci(10));
    }   
} 


