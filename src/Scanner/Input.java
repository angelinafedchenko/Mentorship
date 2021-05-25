package Scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Type five");
//
//        int value = scanner.nextInt();
//
//        while (value != 5) {
//            System.out.println("Type 5");
//            value = scanner.nextInt();
//        }
//        System.out.println("It's five!");
//    }

        int value;

        do {
            System.out.println("Type five");
            value = scanner.nextInt();

        } while (value != 5);

        System.out.println("It's five!");


        float temp;
        do {
            System.out.println("What is the temperature?");
            temp = scanner.nextFloat();

        } while (temp != 22.0);
        System.out.println("It's ok'");
    }




}

