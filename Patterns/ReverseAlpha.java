public class ReverseAlpha {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 65; j < 65 + i; j++) {
                System.out.print((char) j);
            }

            System.out.println();
        }
    }
}