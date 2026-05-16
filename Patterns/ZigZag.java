public class ZigZag {

    public static void main(String[] args) {

        int n = 9;

        // 3 rows
        for (int i = 1; i <= 3; i++) {

            // Columns
            for (int j = 1; j <= n; j++) {

                // Zig-Zag condition
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}