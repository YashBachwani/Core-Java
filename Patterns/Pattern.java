public class Pattern {
    public static void main(String[] args){
        int n = 5;

        for(int i=1;i<=n;i++){
            System.out.println("*");
        }

        for(int i=1;i<=n;i++){
            System.out.print("*");
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

            // [a11 a12 a13 a14 a15
            //  a21 a22 a23 a24 a25
            //  a31 a32 a33 a34 a35
            //  a41 a42 a43 a44 a45
            //  a51 a52 a53 a54 a55]

        }
    }
}