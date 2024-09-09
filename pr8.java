public class pr8 {
    public static String doubleCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(doubleCharacters("The"));  
        System.out.println(doubleCharacters("Hello"));  
        System.out.println(doubleCharacters("A"));    
    }
}