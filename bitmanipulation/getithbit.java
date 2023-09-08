

public class getithbit {

    static int getithbit(int n ,int place){
        int bitmask =  1<< place; // Replace with the desired number

        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {

        System.out.println(getithbit(10 , 2 ));
        
        System.out.println(getithbit(10 , 3 ));
        
        System.out.println(getithbit(10 , 4 ));
    }
    
}