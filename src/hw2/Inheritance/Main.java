package hw2.Inheritance;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        a.aClass();
        //a.bb();
        //a.cClass();

        A aa = new B();
        aa.aClass();
        //aa.bb();
        //aa.cClass();

        A aaa = new C();
        aaa.aClass();
        //aaa.bb();
        //aaa.cClass();


        B b = new B();
        b.aClass();
        b.bb();
        //b.cClass();

        //B bb = new A();

        B bbb = new C();
        bbb.aClass();
        bbb.bb();
        //bbb.cClass();

        C c = new C ();
        c.aClass();
        c.bb();
        c.cClass();

        //C cc = new A ();

        //C ccc = new B ();

    }
}
