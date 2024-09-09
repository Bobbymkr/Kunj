import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product code (1-5):");
        int productCode = scanner.nextInt();
        System.out.println("Enter the price:");
        double price = scanner.nextDouble();
        calculateSalesTax(productCode, price);
    }

    public static void calculateSalesTax(int productCode, double price) {
        double salesTax = 0;
        switch (productCode) {
            case 1:
                salesTax = price * 0.08;
                break;
            case 2:
                salesTax = price * 0.12;
                break;
            case 3:
                salesTax = price * 0.05;
                break;
            case 4:
                salesTax = price * 0.075;
                break;
            default:
                salesTax = price * 0.03;
        }
        System.out.println("Sales tax is " + salesTax);
    }
}