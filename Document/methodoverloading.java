import java.util.Scanner;

class Addition {

    // Method with 2 parameters
    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    // Overloaded method with 3 parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
}

// Main class name should match file name
public class methodoverloading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Addition obj = new Addition();

        // User input for 2 numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        obj.add(a, b);

        // User input for 3 numbers
        System.out.print("\nEnter third number: ");
        int c = sc.nextInt();

        obj.add(a, b, c);

        sc.close();
    }
}