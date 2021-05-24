package hw2.Methods;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.printAlphabet());
        System.out.println(a.learn());

        B b = new B();
        System.out.println(b.sum(1,2));

        System.out.println(b.compare(-3, 3));

        C c = new C();
        System.out.println(c.getSquare());
        c.sayHello();

        D d = new D();
        System.out.println(d.getVolume(1,2,3));

        D.volumeResalt();

        E.staticMethod();

        E e = new E();
        e.nonStaticMethod();

        F f = new F();
        System.out.println(f.calculateYesterday(17));
        f.sayBye();

        G g = new G();
        System.out.println("До пенсии тебе " + g.calculateYearsToRetirement(35) + " лет");

        G.printCurrentMonth();

        H h = new H();
        System.out.println(h.doubleMultiply(0.1, 0.2));

        System.out.println(h.dataString(30.6f, "It is string", 30.6));

        I i = new I();
        System.out.println(i.stringInfo(77.7));

        I.iClassMethod();

        J j = new J();
        System.out.println("Letter is: " + j.sayLetter('a'));

        J.saidLetter();
    }


}
