import java.util.Scanner;

// Parent Class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class name should match file name
public class polymorphism {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating objects
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.print("Enter Animal Type (dog/cat): ");
        String choice = sc.nextLine();

        // Polymorphism
        if(choice.equalsIgnoreCase("dog")) {
            d.sound();
        }
        else if(choice.equalsIgnoreCase("cat")) {
            c.sound();
        }
        else {
            System.out.println("Invalid Animal");
        }

        sc.close();
    }
}