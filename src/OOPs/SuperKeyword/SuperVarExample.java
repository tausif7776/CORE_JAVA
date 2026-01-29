package CORE_JAVA.SuperKeyword;

// To Call The Super Class Variable..........

class Father {
    int balance = 50000;
}
class Son extends Father {
    int balance = 12000;

    public Son() {
        System.out.println("Son Balance is 🤷‍♂️ : " +balance);
        System.out.println("Father Balance is 🤷‍ : " +super.balance);
    }
}
public class SuperVarExample {
    public static void main(String[] args) {
        new Son();
    }
}
