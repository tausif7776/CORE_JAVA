package CORE_JAVA.SuperKeyword;

//import java.util.Scanner;
//
//class Shape {
//    protected int x;
//
//    public Shape(int x) {
//        this.x = x;
//        System.out.println("X Value is : " +x);
//    }
//}
//class Square extends Shape {
//    public Square(int y) {
//        super(y);
//    }
//    public void areaOfSquare() {
//        System.out.println("Area Of Square is : " +x);
//    }
//}
//public class Calling_Parameterized_Constructor_of_SuperClass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Side of the Square.");
//        int area = sc.nextInt();
//
//        Square s = new Square(area);
//    }
//}









import java.util.Scanner;

class Shape {
    protected int x;
    public Shape(int x) {
        this.x = x;
//        System.out.println(x);
    }
}
class Square extends Shape {
    public Square(int y) {
        super(y); // Calling the Parameterized Constructor of Super Class
    }
    public void areaOfSquare() {
        System.out.println("Area Of Square is : " +(x*x));
    }
}
class Rectangle extends Square {
    protected int z;
    public Rectangle(int l, int b) {
        super(l);
        z = b;
    }
    public void areaOfRectangle() {
        System.out.println("Area of Rectangle is : " +(x*z));
    }
}
public class Calling_Parameterized_Constructor_of_SuperClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of the Square : ");
        int area = sc.nextInt();
        Square s1 = new Square(area);
        s1.areaOfSquare();

        System.out.print("Enter the Rectangle of length : ");
        int length = sc.nextInt();
        System.out.print("Enter the Rectangle of breath : ");
        int breath = sc.nextInt();
        Rectangle r1 = new Rectangle(length, breath);
        r1.areaOfRectangle();
    }
}




















