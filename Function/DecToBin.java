package Function;

public class DecToBin {
    

    public static void dectobin(int decnum){
        int pow = 0 ;
        int binNum = 0;
        while(decnum > 0){
            int remainder = decnum % 2;
            binNum = binNum + (remainder *(int)Math.pow(2, pow));
            pow++;
            decnum = decnum/2;
        }

        System.out.println(binNum);
    }
    public static void main(String[] args) {
        dectobin(7);
    }
}
