import java.util.Scanner;

// Parent Class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class inheriting Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class name should match file name
public class inheritence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object of child class
        Dog d1 = new Dog();

        // Taking user input
        System.out.print("Enter Dog Name: ");
        String name = sc.nextLine();

        System.out.println("\nDog Name: " + name);

        // Calling parent class method
        d1.sound();

        // Calling child class method
        d1.bark();

        sc.close();
    }
}