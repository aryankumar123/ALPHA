

public class setithbit {

    static int setithbit(int n ,int place){
        int bitmask =  1<< place; // Replace with the desired number

            return n | bitmask ;
    }
    public static void main(String[] args) {

        System.out.println(setithbit(10 , 2 ));
        
        System.out.println(setithbit(10 , 3 ));
        
        System.out.println(setithbit(10 , 4 ));
    }
    
}
