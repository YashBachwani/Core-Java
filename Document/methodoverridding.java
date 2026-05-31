// Parent Class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class overriding parent method
class Dog extends Animal {

    // @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class name should match file name
public class methodoverridding {

    public static void main(String[] args) {

        Dog d = new Dog();

        // Calling overridden method
        d.sound();
    }
}