public class Basics{
    int c ;
    int sum(int a, int b){
        c = a+b;
        return(c);
    }
    public static void main(String[] args){
        Basics obj = new Basics();
        System.out.println("The sum of this numbers are "+ obj.sum(10,20));
    }
}