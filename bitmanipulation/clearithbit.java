
public class clearithbit {

    static int clearithbit(int n ,int place){
        int bitmask =  ~(1<< place); // Replace with the desired number

            return n & bitmask ;
    }
    public static void main(String[] args) {

        System.out.println(clearithbit(10 , 2 ));
        
        System.out.println(clearithbit(10 , 1 ));
        
        System.out.println(clearithbit(10 , 4 ));
    }
    
}
