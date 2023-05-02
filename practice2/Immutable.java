package practice2;

public class Immutable {
    public static void main(String[] args){
        String str = "Aryan";
        str = "kumar";

        String str1  = new String("alok");
 
        str1 = "gupta";

        str = str1;

        System.out.println(str);
        System.out.println(str1);

    }
    
}
