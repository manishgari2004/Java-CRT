class Person {
    String name = "John";
    int age = 25;

    void walk() {
        System.out.println("Walking Slowly");
    }
}

class Employee {
    void walk() {
        System.out.println("Walking Fast");
    }
}

public class Main {
    public static void main(String[] args) {
        Person object1 = new Person();
        Employee object = new Employee();
        Person object2 = new Person();

        object1.walk();
        object.walk();
        object2.walk();
    }
}
