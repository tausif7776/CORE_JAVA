package CORE_JAVA.Method_Overriding;

class Animal {
    void eat() {
        System.out.println("I Can't Say..");
    }
}
class Lion extends Animal {
    void eat() {
        System.out.println("Lion, is Non-veg type..");
    }
}
class Horse extends Animal {
    void eat() {
        System.out.println("Horse, is Veg type..");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Lion();  //Upcasting
        a.eat();

        Animal a1 = new Horse();
        a1.eat();

       // Lion l = (Lion) new Animal(); // DownCasting
       // l.eat(); // Exception

    }
}
