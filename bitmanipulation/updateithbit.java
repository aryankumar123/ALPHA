
public class updateithbit {

    static int clearithbit(int n ,int place){
        int bitmask =  ~(1<< place); // Replace with the desired number

            return n & bitmask ;
    }

    static int updateithbit(int n ,int place , int newbit){
        n = clearithbit(n , place );
        int bitmask =  newbit << place; // Replace with the desired number

        return n | bitmask ;
    }
    public static void main(String[] args) {

        System.out.println(updateithbit(10 , 2 ,1));
        
        System.out.println(updateithbit(10 , 1 ,2));
        
        System.out.println(updateithbit(10 , 4,1 ));
    }
    
}
