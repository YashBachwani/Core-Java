public class PascalTriangle {

    public static void main(String[] args) {

        int n = 5;

        // Outer loop for rows
        for (int i = 0; i < n; i++) {

            int number = 1;

            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 0; j <= i; j++) {

                System.out.print(number + " ");

                // Formula for Pascal Triangle
                number = number * (i - j) / (j + 1);
            }

            // Next line
            System.out.println();
        }
    }
}