package Recursion;

public class PrintIncreseing {
    public static void PrintIncrese(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintIncrese(n-1);
        System.out.println(n+" ");
        

    }
    public static void main(String[] args) {
        int n =10;
        PrintIncrese(n);
    }
}
