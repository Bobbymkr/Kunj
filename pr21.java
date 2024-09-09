import java.util.Scanner;
interface AdvancedArithmetic {
 int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
 
 public int divisor_sum(int n) {
 int sum = 0;
 for (int i = 1; i <= n; i++) {
 if (n % i == 0) {
 sum += i;
 }
 }
 return sum;
 }
}
class pr21 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter The Number:");
 int j= sc.nextInt();
 MyCalculator calc = new MyCalculator();
 System.out.println("Sum of divisors Is: " + calc.divisor_sum(j));
 System.err.println("Kunj Moradiya 23DIT035");
 }
}