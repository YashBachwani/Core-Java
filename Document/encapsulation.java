import java.util.Scanner;

// Encapsulation Example with User Input

class Student {

    // Private variables
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {

        // Validation
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

// Main class name should match file name
public class encapsulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object
        Student s1 = new Student();

        // Taking user input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        // Setting values using setters
        s1.setName(name);
        s1.setAge(age);

        // Displaying values using getters
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        sc.close();
    }
}