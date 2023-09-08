// import java.util.*;

public class oddeven {

    static void oddOreven(int n){
        int bitmask = 1; // Replace with the desired number

        if ((n & bitmask) == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
    public static void main(String[] args) {
   
        oddOreven(3);
        oddOreven(5);
        oddOreven(8);
    }
    
}


