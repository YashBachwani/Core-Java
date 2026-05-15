import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Ternary operator to find the maximum
        // (condition) ? (value if true) : (value if false)
        double max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number is: " + max);

        // Close the scanner
        sc.close();
    }
}