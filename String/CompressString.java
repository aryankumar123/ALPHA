package String;

public class CompressString {
    public static void main(String[] args) {
        String input = "aaaabbccc"; // Replace with your input
        compress(input);

        // String compressedString = "";
        // char currentChar = input.charAt(0);
        // int count = 1;

        // for (int i = 1; i < input.length(); i++) {
        //     if (input.charAt(i) == currentChar) {
        //         count++;
        //     } else {
        //         compressedString += currentChar;
        //         if (count > 1) {
        //             compressedString += count;
        //         }
        //         currentChar = input.charAt(i);
        //         count = 1;
        //     }
        // }

        // compressedString += currentChar;
        // if (count > 1) {
        //     compressedString += count;
        // }

        // System.out.println(compressedString);
    }

    static void compress(String str){
        String newstr ="";
        for (int i = 0; i < str.length(); i++) {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count >1){
                newstr += count.toString();
            }
        }
        System.out.println(newstr);
    }
}
