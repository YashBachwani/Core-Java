import java.util.Scanner;

public class Closet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number 1 :");
        int number = scanner.nextInt();
        System.out.println("enter your number 2 :");
        int number1 = scanner.nextInt();

        int div1 = number / number1;
        int mull = div1 * number1;

        
       
        if(number % number1 == 0)
        {
            System.out.println("number is divisable");
        }
        else
        {
                System.out.println("The closet number to "+ number + " is "+mull);
        }

    }
}