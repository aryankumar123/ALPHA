public class clearIbits {


    static int clearIbits(int n ,int place ){
        int bitmask =  (~0)<<place;

        return n & bitmask ;
    }
    public static void main(String[] args) {

        System.out.println(clearIbits(15 , 2 ));
        
        System.out.println(clearIbits(10 , 1 ));
        
        System.out.println(clearIbits(10 , 4));
    }
    
}