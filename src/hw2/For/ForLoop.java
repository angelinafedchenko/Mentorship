package hw2.For;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i = i++) {
            System.out.println("Hello" + i++);
        }

        System.out.println("===========");

        for (int a = 100; a >= 10; a = a - 5) {
            System.out.println("Hello" + a);
        }

        System.out.println("===========");

        for (int b = 0; b < 5; b++) {
            System.out.println(b);
        }

    }

}
