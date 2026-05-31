public class Basics{
    int c ; // variable declaration
    int sum(int a, int b){  // method building  
        c = a+b;
        return(c);
    }
    public static void main(String[] args){ // main class
        Basics obj = new Basics(); // object creation
        System.out.println("The sum of this numbers are "+ obj.sum(10,20)); // method callinng
    }
}