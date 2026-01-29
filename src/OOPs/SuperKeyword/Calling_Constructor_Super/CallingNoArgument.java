package CORE_JAVA.SuperKeyword.Calling_Constructor_Super;

//class A {
//    public A() {
//        System.out.println("Class A No-argument Constructor..");
//    }
//}
//class B extends A {
//    public B() {
//        System.out.println("Class B No-argument Constructor..");
//    }
//}
//public class CallingNoArgument {
//    public static void main(String[] args) {
//        B b1 = new B();
//    }
//}


//class A {
//    public A(int a) {
//        System.out.println("Class A No-argument Constructor : " +a);
//    }
//}
//class B extends A {
//    public B() {
//        super(40);
//        System.out.println("Class B No-argument Constructor..");
//    }
//}
//public class CallingNoArgument {
//    public static void main(String[] args) {
//        B b1 = new B();
//    }
//}




class A {
    public A() {
        System.out.println("Class A No-argument Constructor..");
    }
}
class B extends A{
    public B() {
        System.out.println("Class B No-argument Constructor..");
    }
}
class C extends B {
    public C() {
        System.out.println("Class C No-argument Constructor..");
    }
}
public class CallingNoArgument {
    public static void main(String[] args) {
        C b1 = new C();
    }
}














