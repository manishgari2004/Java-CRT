class Parent {
    void show() {  
        System.out.println("Parent class show() method");
    }

    void show(int x) { 
        System.out.println("Parent class show(int x) method: " + x);
    }
}

class Child extends Parent {
    void show(double y) { 
        System.out.println("Child class show(double y) method: " + y);
    }
}

public class overloading {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show(5.5);  
        obj.show(10); 
        obj.show();     
    }
}