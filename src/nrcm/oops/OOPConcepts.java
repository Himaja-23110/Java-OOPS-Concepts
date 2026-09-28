package nrcm.oops;


// Encapsulation + Class
class Student {

    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// Inheritance
class Person {

    void showRole() {
        System.out.println("I am a Person");
    }
}

class Employee extends Person {

    // Method Overriding
    @Override
    void showRole() {
        System.out.println("I am an Employee");
    }
}


// Abstraction
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car started");
    }
}


// Interface
interface Payment {

    void pay();
}

class OnlinePayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment completed online");
    }
}


// Main Class
public class OOPConcepts {

    // Method Overloading
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {

        // Class and Object
        System.out.println("===== CLASS & OBJECT =====");

        Student s1 = new Student("Himaja", 23);
        s1.display();


        // Encapsulation
        System.out.println("\n===== ENCAPSULATION =====");

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());


        // Inheritance
        System.out.println("\n===== INHERITANCE =====");

        Employee e = new Employee();
        e.showRole();


        // Polymorphism - Overriding
        System.out.println("\n===== METHOD OVERRIDING =====");

        Person p = new Employee();
        p.showRole();


        // Polymorphism - Overloading
        System.out.println("\n===== METHOD OVERLOADING =====");

        System.out.println("Integer Addition: " + add(10, 20));
        System.out.println("Double Addition: " + add(10.5, 20.5));


        // Abstraction
        System.out.println("\n===== ABSTRACTION =====");

        Car c = new Car();
        c.start();
        c.stop();


        // Interface
        System.out.println("\n===== INTERFACE =====");

        OnlinePayment payment = new OnlinePayment();
        payment.pay();
    }
}