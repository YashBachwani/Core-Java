public class Number {

    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Next line
            System.out.println();
        }
    }
}