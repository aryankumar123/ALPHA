package Recursion;

public class PrintDecresing {
    public static void printDecrese(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDecrese(n-1);

    }
    public static void main(String[] args) {
        int n =10;
        printDecrese(n);
    }
}
