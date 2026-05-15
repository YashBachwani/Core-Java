public class ContinuousAlpha {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            // Character for current row
            char ch = (char)(64 + i);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println()
        }
    }
}