public class StringExample {
    public static void ReverseString() {
        String s = "heropanti";
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            // Extracts each character
            ch = s.charAt(i);

            // Adds each character to the front of the existing string
            r = ch + r; 
        }

        System.out.println(r);
    }

    public static void main(String[] args) {
        ReverseString();
    }
}
