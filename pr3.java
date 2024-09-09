import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a mobile number in the format +91-AA-BBB-CCCCC:");
        String mobileNumber = scanner.nextLine();
        parseMobileNumber(mobileNumber);
    }

    public static void parseMobileNumber(String mobileNumber) {
        if (mobileNumber.matches("\\+91-\\d{2}-\\d{3}-\\d{5}")) {
            String[] parts = mobileNumber.split("-");
            System.out.println("Mobile system operator code is " + parts[1]);
            System.out.println("MSC is " + parts[2]);
            System.out.println("Unique code is " + parts[3]);
        } else {
            System.out.println("Invalid mobile number format.");
        }
    }
}