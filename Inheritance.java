class Animal {  
    void eat() {  
        System.out.println("Eating...");  
    }  
}  
  
class Dog extends Animal {  
    void bark() {  
        System.out.println("Barking...");  
    }  
}  
  
class Cat extends Animal {  
    void meow() {  
        System.out.println("Meowing...");  
    }  
}  \7///
  
class BabyDog extends Dog {  
    void weep() {  
        System.out.println("Weeping...");  
    }  
}  
  
public class Inheritance {  
    public static void main(String args[]) {  
        BabyDog littleDog = new BabyDog();  
        littleDog.eat();  
        littleDog.bark();  
        littleDog.weep(); 
    }  
}-