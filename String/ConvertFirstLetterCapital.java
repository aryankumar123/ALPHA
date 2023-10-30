package String;

public class ConvertFirstLetterCapital {
    public static void main(String[] args) {
        String input = "this is a line of words"; // Replace with your input

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        String capitalizedLine = result.toString().trim();
        System.out.println(capitalizedLine);
    }
}
