package hw2.While;

public class doWhile {

    public static void main(String[] args) {
        int value = 0;

        while (value < 5) {
            System.out.println("Hello" + value);
            value = value + 1;
        }

        System.out.println("===========");

        int number = 3;
        int result = 1;
        int power = 1;

        while (power <= 10) {
            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }

        System.out.println("===========");

        int number1 = 3;
        int result1 = 1;
        int power1 = 1;

        while (result1 < 729) {
            result1 = result1 * number1;

            System.out.println(number1 + " в степени " + power1 + " = " + result1);
            power1++;
        }

        System.out.println("===========");

        int number2 = 2;
        int result2 = number2;
        int power2 = 1;

        do {
            System.out.println(number2 + " в степени " + power2 + " = " + result2);
            power2++;
            result2 = result2 * number2;
        } while (result2 < 500);


        System.out.println("===========");

        int b = 0;

        while (b<9) {
            System.out.println("b < 9 " + "b = " + b);
            b = b+1;

            if (b==7) {
                System.out.println("b=7");

                continue;
            }
        }
    }

}