public class StarNumber {

    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {

            // Print stars
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            // Print number
            System.out.print(i);

            // Move to next line
            System.out.println();
        }
    }
}