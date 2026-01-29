package CORE_JAVA.SuperKeyword;

class Super {
    public void show() {
        System.out.println("Super class show Method....");
    }
}
class Sub extends Super {
    public void show() {
        System.out.println("Sub class show method...");
        super.show();
    }
}
public class SuperMethodExample {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        s1.show();
    }
}
