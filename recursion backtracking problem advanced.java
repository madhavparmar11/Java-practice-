public class Backtracking {
    public static void Permutation(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.println(perm + " ");
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // Form new string excluding the current character
            String newString = str.substring(0, i) + str.substring(i + 1);
            Permutation(newString, perm + currChar, index + 1);
        }
    }

    public static void main(String[] args) {
        Permutation("ABC", "", 0);
    }
}
