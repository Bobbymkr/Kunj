import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in pounds: ");
        double pounds = scanner.nextDouble();
        double rupees = pounds * 95.75;
        System.out.println(pounds + " pounds is equal to " + rupees + " rupees");
    }
}