package CORE_JAVA.Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating food......");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking....");
    }
}
class puppy extends Dog {
    void sleep() {
        System.out.println("Puppy is Sleeping....");
    }
}
public class Test {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.sleep();
        p.eat();
        p.bark();
    }
}
