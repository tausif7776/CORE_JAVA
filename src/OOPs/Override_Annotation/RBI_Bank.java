package CORE_JAVA.Override_Annotation;

class RBI {
    public void loan() {
        System.out.println("Bank Should be Provide Instruction for Loan.");
    }
}
class SBI extends RBI {
    @Override  // This is Optional not Complusory
    public void loan() {
        System.out.println(" SBI, Providing loan @ 9.6%");
    }
}
class BOB extends RBI {
    @Override
    public void loan() {
        System.out.println(" BOB, Providing loan @ 10.2%");
    }
}
public class RBI_Bank {
    public static void main(String[] args) {
        RBI r;
        r = new SBI(); r.loan();
        r = new BOB(); r.loan();
    }
}
