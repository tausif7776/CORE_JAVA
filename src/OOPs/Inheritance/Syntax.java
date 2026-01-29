package CORE_JAVA.Inheritance;

class Parent {
    int money = 1000;
    void house() {
        System.out.println("Parent has a house");
    }
}
class Child extends Parent {
    void bike() {
        System.out.println("Child has a bike");
    }
}
class Syntax {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.house();
        c1.bike();
        System.out.println(c1.money);
    }
}
