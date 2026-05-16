public class NumberPattern {

    public static void main(String[] args) {

        int n = 4;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            // Next line
            System.out.println();
        }
    }
}