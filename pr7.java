public class pr7 {
    public static int countNines(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public static String replaceSubstring(String original, String regex, String replacement) {
        return original.replaceAll(regex, replacement);
    }

    public static void main(String[] args) {
        
        int[] numbers = {1, 9, 3, 9, 5, 9, 7};
        System.out.println("Number of 9s: " + countNines(numbers));

        
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String modifiedSentence = replaceSubstring(sentence, "fox", "cat");
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}