package String;

public class BuilderString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, "); // Append a string
        sb.append(42); // Append an integer
        sb.append(3.14); // Append a double
        sb.append(true); // Append a boolean
        System.out.println(sb);
    }
}
