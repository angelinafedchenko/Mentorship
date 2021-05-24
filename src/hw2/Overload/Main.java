package hw2.Overload;

public class Main {

    public static void main(String[] args) {

        User first = new User();

        first.userParametr();

        System.out.println(first.userParametr(123));

        first.userParametr1();

        System.out.println(first.userParametr(1, 123f));

        System.out.println(first.userParametr(123f, 1));

        System.out.println(first.userParametr(1,3));
    }
}
