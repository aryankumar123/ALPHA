
public class checkPowOfTwo {


    static boolean checkPowOfTwo(int n  ){
     

        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {

        System.out.println(checkPowOfTwo(15  ));
        
        System.out.println(checkPowOfTwo(8 ));
        
        System.out.println(checkPowOfTwo(10 ));
    }
    
}