package hw2.Overload;

public class User {

    public void userParametr() {
        System.out.println("Name: Harry");
    }

    public String userParametr(int a) {
        return String.valueOf(a);
    }

    public void userParametr1() {
        System.out.println("Name: Harry2");
    }

    public String userParametr(int a, float b) {
        return String.valueOf(a + b);
    }

    public float userParametr(float b, int a) {
        return a + b;
    }

    //public int userParametr(int b) {
    //    return b;
    //}

//    public boolean userParametr(float b, int a) {
//        boolean z = b == a;
//        return z;
//    }

    public boolean userParametr(int a, int c) {
        boolean z = a == c;
        return z;
    }
}
