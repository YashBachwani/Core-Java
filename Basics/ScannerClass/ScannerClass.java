import java.util.Scanner;

class ScannerClass {
    public static void main(String[] args)
    {
        // Creating Scanner object
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = scn.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();

        System.out.println("Sum: " + (a + b));
        scn.close();
    }
}