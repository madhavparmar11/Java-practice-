public class StringExample {
    public static void manipulateStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(",");
        sb.append("World");
        System.out.println("Before delete: " + sb);

        // Deletes characters from index 1 to 2
        sb.delete(1, 3);
        System.out.println("After delete: " + sb);

        // Extracts a substring starting from index 3
        String substring = sb.substring(3);
        System.out.println("Substring from index 3: " + substring);
    }

    public static void main(String[] args) {
        manipulateStringBuilder();
    }
}
