package String;

public class StingExamples {

    public static void main(String[] args) {
        // Initialize a sample string
        String sampleString = "Hello, World!";

        // charAt(int index)
        char character = sampleString.charAt(7);
        System.out.println("Character at index 7: " + character);

        // substring(int beginIndex)
        String substring1 = sampleString.substring(7);
        System.out.println("Substring from index 7: " + substring1);

        // substring(int beginIndex, int endIndex)
        String substring2 = sampleString.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2);

        // equals(Object another)
        String string1 = "Hello";
        String string2 = "Hello";
        boolean areEqual = string1.equals(string2);
        System.out.println("Are strings equal? " + areEqual);

        // contains(CharSequence sequence)
        boolean containsWorld = sampleString.contains("World");
        System.out.println("Contains 'World'? " + containsWorld);

        // replace(char oldChar, char newChar)
        String replacedString = sampleString.replace('W', 'w');
        System.out.println("After replacing 'W' with 'w': " + replacedString);

        // startsWith(String prefix)
        boolean startsWithHello = sampleString.startsWith("Hello");
        System.out.println("Starts with 'Hello'? " + startsWithHello);

        // endsWith(String suffix)
        boolean endsWithExclamation = sampleString.endsWith("!");
        System.out.println("Ends with '!'? " + endsWithExclamation);

        // toLowerCase()
        String lowerCase = sampleString.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // toUpperCase()
        String upperCase = sampleString.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // String Concatenation
        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1 + str2;
        System.out.println("Concatenation: " + result);

        // String Length
        String text = "This is a sample text.";
        int length = text.length();
        System.out.println("Length: " + length);

        // Substring
        String subtext = text.substring(5, 11); // Substring from index 5 to 10
        System.out.println("Substring: " + subtext);

        // String Comparison
        String str3 = "apple";
        String str4 = "banana";
        int comparison = str3.compareTo(str4);
        System.out.println("Comparison: " + comparison);

        // String Manipulation
        String input = "   Trim me   ";
        String trimmed = input.trim(); // Remove leading and trailing spaces
        System.out.println("Trimmed: " + trimmed);

        // String Splitting
        String csvData = "apple,banana,cherry";
        String[] fruits = csvData.split(",");
        System.out.println("Splitting:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // String Replacement
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String replaced = sentence.replace("fox", "cat");
        System.out.println("Replacement: " + replaced);

        // String Formatting
        String name = "John";
        int age = 30;
        String formatted = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println("Formatted: " + formatted);
    }
}