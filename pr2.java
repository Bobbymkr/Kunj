import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to convert to Morse code or 'morse' to convert from Morse code:");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("morse")) {
            System.out.println("Enter a Morse code string:");
            String morseCode = scanner.nextLine();
            System.out.println(morseToText(morseCode));
        } else {
            System.out.println(textToMorse(input));
        }
    }

    public static String textToMorse(String text) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder result = new StringBuilder();
        for (char c : text.toLowerCase().toCharArray()) {
            if (c == ' ') {
                result.append(" / ");
            } else {
                result.append(morseCode[c - 'a']).append(" ");
            }
        }
        return result.toString();
    }

    public static String morseToText(String morseCode) {
        String[] text = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder result = new StringBuilder();
        for (String code : morseCode.split(" ")) {
            if (code.equals("/")) {
                result.append(" ");
            } else {
                for (int i = 0; i < text.length; i++) {
                    if (text[i].equals(code)) {
                        result.append((char) (i + 'a'));
                        break;
                    }
                }
            }
        }
        return result.toString();
    }
}