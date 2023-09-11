import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Input annual interest rate (in decimal)
        System.out.print("Enter the annual interest rate (decimal): ");
        double rate = scanner.nextDouble();

        // Input number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        // Input the number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / n), n * years);

        // Display the result
        System.out.println("The final amount is: " + amount);

        // Close the scanner
        scanner.close();
    }
}
