import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pr25_2{
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException (checked): " + e.getMessage());
        }

        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException (checked): " + e.getMessage());
        }
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException (unchecked): " + e.getMessage());
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException (unchecked): " + e.getMessage());
        }
    }
}