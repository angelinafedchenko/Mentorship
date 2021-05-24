package hw2.Override;

public class D {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.serialNumber();
        b.serialNumber();
        c.serialNumber();

        System.out.println("My number is: " + a.number(1));
        System.out.println("My number is: " + b.number(2));
        System.out.println("My number is: " + c.number(3));

        System.out.println(c.letter1("c"));
        System.out.println(c.letter1("a"));

    }
}
