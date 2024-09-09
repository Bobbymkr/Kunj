public class pr6 {
    public static String repeatFirstChars(String str, int n) {
        if (str == null || str.isEmpty() || n <= 0) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str.charAt(i % str.length()));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(repeatFirstChars("Hello", 3)); 
        System.out.println(repeatFirstChars("Hi", 5));    
        System.out.println(repeatFirstChars("A", 3));    
    }
}