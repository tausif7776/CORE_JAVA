package CORE_JAVA.Method_Overloading;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    float add(float a, float b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(10, 20));
        System.out.println(c1.add(10, 20, 30));
        System.out.println(c1.add(2.5, 3.6));
        System.out.println(c1.add(2.33f, 4.55f));
    }
}
