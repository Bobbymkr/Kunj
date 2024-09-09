public class pr10 {
    public static String encryptString(String input, char targetChar, char replaceChar) {
        System.out.println("Number of characters: " + input.length());
        String modified = input.replace(targetChar, replaceChar);
        modified = modified.toLowerCase();
        System.out.println("Modified string: " + modified);
        return modified;
    }

    public static void main(String[] args) {
        String original = "CHARUSAT UNIVERSITY";
        char targetChar = 'H';
        char replaceChar = 'A';
        String encrypted = encryptString(original, targetChar, replaceChar);
    }
}