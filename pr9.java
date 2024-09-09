import java.util.Arrays;

public class pr9 {
    public static void analyzeString(String input) {
        System.out.println("Number of characters: " + input.length());
        String standardized = input.toLowerCase();
        System.out.println("Standardized string: " + standardized);
        String[] words = standardized.split("\\s+");
        System.out.println("Potential keywords:");
        for (String word : words) {
            if (word.length() >= 5) {
                System.out.println(word);
            }
        }
        System.out.println("Palindromes:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
        char[] chars = standardized.toCharArray();
    }
}