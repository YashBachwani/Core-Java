public class Alternating {

    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {

            // Inner loop for printing pattern
            for (int j = 1; j <= i; j++) {

                // Printing 1 and 0 alternatively
                System.out.print((i + j) % 2);
            }

            // Move to next line
            System.out.println();
        }
    }
}


// Alternative Option Just change the meaning and solve the question


public class Alternating {

    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {

            // Inner loop for columns
            for (int j = 1; j <= i; j++) {

                // Alternate 1 and 0 based on row + column
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            // Next line
            System.out.println();
        }
    }
}