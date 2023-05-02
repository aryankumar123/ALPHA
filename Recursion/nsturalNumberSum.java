package Recursion;

public class nsturalNumberSum {

    public static int nstural(int n) {
        if (n == 1) {
            return 1;
        } 

       return n + nstural(n-1);
    }

    public static void main(String[] args) {
        System.out.println(nstural(11112));

    }
    
}
