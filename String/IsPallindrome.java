package String;

public class IsPallindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Input string
        String str = "abba";

        // Convert the string to lowercase
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}
